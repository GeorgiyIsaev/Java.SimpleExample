package researchOnJUnit5Tests;
//JUnit5 - junit-jupiter-params
//https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params

import org.apache.commons.lang3.StringUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParameterizedTests {
    public boolean isPalindrome(String s) {
        for(int i = 0; i<s.length()/2; i++) {
           if( s.charAt(i)!= s.charAt(s.length()-1 - i)){
               return false;
           }
        }
        return true;
    }
    //1. Для ValueSource нельзя передать null даже для String
    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    @ValueSource(strings = { "12321", "pop" })
    void testPalindrome(String word) {
        Assertions.assertTrue(isPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testMethod(int argument) {
        Assertions.assertTrue(argument > 0);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testMethodWithAutoboxing(Integer argument) {
        Assertions.assertTrue(argument > 0);
    }

    /// --- /// --- /// --- /// --- ///
    //2. Аннотация @NullSource позволяет передать null
    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        Assertions.assertTrue(argument == null);
    }

    /// --- /// --- /// --- /// --- ///
    //3. Аннотация @EmptySource пустое значение для String, List, Set, Map, массив
    @ParameterizedTest
    @EmptySource
    void testMethodEmptySource(String argument) {
        Assertions.assertTrue(StringUtils.isEmpty(argument));
    }

    /// --- /// --- /// --- /// --- ///
    //4. Аннотация @NullAndEmptySource сочетает @NullSource и @EmptySource
    @ParameterizedTest
    @NullAndEmptySource
    void testMethodNullAndEmptySource(String argument) {
        Assertions.assertTrue(StringUtils.isEmpty(argument));
    }

    /// --- /// --- /// --- /// --- ///
    //5. Аннотация @EnumSource - Удобный способ использования Enum констант
    enum Direction {
        EAST, WEST, NORTH, SOUTH
    }

    @ParameterizedTest
    @EnumSource(Direction.class)
    void testWithEnumSource(Direction d) {
        Assertions.assertNotNull(d);
    }

    /// --- /// --- /// --- /// --- ///
    //6. Аннотация @MethodSource - ссылка на фабричный метод.
    // Метод статичный, не принимает параметров.
    // Метод генерирует поток аргументов
    static Stream<String> argsProviderFactory() {
        return Stream.of("alex", "brian");
    }

    @ParameterizedTest
    @MethodSource("argsProviderFactory")
    void testWithMethodSource(String argument) {
        Assertions.assertNotNull(argument);
    }

    //Если не указать метод будет искать похожую аннотации
    static Stream<String> testWithMethodSource2() {
        return Stream.of("alex", "brian");
    }
    @ParameterizedTest
    @MethodSource
    void testWithMethodSource2(String argument) {
        Assertions.assertNotNull(argument);
    }

    //Также поддерживает потоки для примитивных
    // типов (DoubleStream, IntStream и LongStream).
    static IntStream argsIntFactory() {
        return IntStream.range(0, 9);
    }
    @ParameterizedTest
    @MethodSource("argsIntFactory")
    void testWithMethodSource(int argument) {
        Assertions.assertNotEquals(9, argument);
    }

    /// --- /// --- /// --- /// --- ///
    //7. Аннотация @CsvSource - задает список аргументов
    @ParameterizedTest
    @CsvSource(value = {
            "alex, 30",
            "brian, 35",
            "charles, 40"
    }, ignoreLeadingAndTrailingWhitespace = true) //игнорирует пробелы
    void testWithCsvSource(String name, int age) {
        Assertions.assertNotNull(name);
        Assertions.assertTrue(age > 0);
    }

    /// --- /// --- /// --- /// --- ///
    //8. Аннотация @CsvFileSource -cчитывает аргументы из файла
    // # в файле интерпретируется как комментарий.
    // numLinesToSkip =1 позволяет пропустить первую строку
    // Аргументы записываются на новой строке через запятую,
    // они не берутся в скобки "", строки не разделяют запятой
    // Файл можно поместить в пакер resources
    @ParameterizedTest
    @CsvFileSource(resources = "/employeeData.csv", numLinesToSkip = 0)
    void testWithCsvFileSource(String name, int age) {
        System.out.println(name + " " + age);
        Assertions.assertNotNull(name);
        Assertions.assertTrue(age > 0);
    }


    /// --- /// --- /// --- /// --- ///
    //9. Аннотация @ArgumentsSource
    class EmployeesArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new Employee(1, "Alex", LocalDate.of(1980, 2, 3))),
                    Arguments.of(new Employee(2, "Brian", LocalDate.of(1979, 2, 3))),
                    Arguments.of(new Employee(3, "Charles", LocalDate.of(1978, 2, 3)))
            );
        }
    }
    @ParameterizedTest(name = "{index} - {0} is older than 40")
    @ArgumentsSource(EmployeesArgumentsProvider.class)
    void isEmployeeAgeGreaterThan40(Employee e) {
        Assertions.assertTrue(Period.between(e.getDob(), LocalDate.now()).get(ChronoUnit.YEARS) > 40);
    }



}
