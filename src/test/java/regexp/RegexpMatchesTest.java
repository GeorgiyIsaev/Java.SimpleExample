package regexp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/// Регулярные выражения:
        /*
         \\d - одна цифра
           + - одна и более цифр
           * - 0 и более цифр
           ? - 0 или 1 символ до
           ( | | |) - множество возможностей отделены |
           \\+ Плюс специальный символ нужно отделить чертой


            Наличие множества
           (х|y|z) Одна из трех маленьких букв x, y или z
           [xyz] Одна из трех маленьких букв x, y или z
           [] - перечисление от до - большое множество
           [a-zA-Z] от a до z + от A до Z
           [0-9] все цифры - равен \\d


           Отсутствие множества
           ^ отрицает наличие символа
           (^х|^y|^z)   Если присутствует одна из трех маленьких букв false
           [^xyz]       Если присутствует одна из трех маленьких букв false
           [^a-zA-Z]    Если присутствует буквы false
           [^0-9]       Если присутствуют цифры false

           . - Точка обозначает любой символ

            Указывает конкретно количество цифр
            {2}       - (\\d{2}) - 2 символа до
            {2, }     - (\\d{2,}) - от 2 или более символа до
            {2, 4}    -  (\\d{2,4}) - от 2 до 4 символов до

            \\w - одна буквы (любая) ==     [^a-zA-Z]
         */





public class RegexpMatchesTest {

    public String notReg(String regexp) {
        return "[" + regexp.replace("\\", "\\\\") + "]";
    }


    public static class ValuesToCompareRegexp implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    //matches(\\d) проверяет что строка это одно число
                    Arguments.of(true, "\\d", Arrays.asList("1", "2", "0")),
                    Arguments.of(false, "\\d", Arrays.asList("1235", "", "Слова", "1Цифра и слова")),

                    //matches(\\d+) проверяет что строка это 1 число + еще несколько чисел
                    Arguments.of(true, "\\d+", Arrays.asList("1", "222", "33333")),
                    Arguments.of(false, "\\d+", Arrays.asList("1235Слово", "Пробел", "", "Слова", "1Цифра и слова")),

                    //matches(\\d*) проверяет что строка это 0 числ + еще несколько чисел -
                    // Для "" тоже true
                    Arguments.of(true, "\\d*", Arrays.asList("", "1", "222", "0", "92193123931")),
                    Arguments.of(false, "\\d*", Arrays.asList("1235Слово", "Слова", "1Цифра и слова")),

                    //matches(-\\d*) проверяет что вначале стоит минус
                    // Для "" тоже true
                    Arguments.of(true, "-\\d*", Arrays.asList("-", "-1", "-222", "-0", "-92193123931")),
                    Arguments.of(false, "-\\d*", Arrays.asList("--2", "123", "1235Слово", "Слова", "1Цифра и слова")),

                    //matches(-?\d+) ? наличие или отсутствие первого символа
                    Arguments.of(true, "-?\\d+", Arrays.asList("1", "-222", "23423", "-33333")),
                    Arguments.of(false, "-?\\d+", Arrays.asList("1235Слово", "Пробел", "", "Слова", "1Цифра и слова")),

                    //matches((+|-)?\d+) ? наличие или отсутствие первого символа
                    //       \\+ Плюс специальный символ нужно отделить чертой \\
                    Arguments.of(true, "(-|\\+)?\\d+", Arrays.asList("+1", "-1", "1", "-33333", "33333", "+33333")),
                    Arguments.of(false, "(-|\\+)?\\d+", Arrays.asList("--1235Слово", "+Пробел", "", "Слова", "1Цифра и слова")),

                    //matches([a-zA-Z]+\\d+) любое количество букв а после них 1 и более цифра
                    // Для "" тоже true
                    Arguments.of(true, "[a-zA-Z]+\\d+", Arrays.asList("sdwdw12", "jjj1", "myuj222", "SFFE0", "Z92193123931")),
                    Arguments.of(true, "[a-zA-Z3]+\\d+", Arrays.asList("sd3wdw12", "j3jj1", "my3uj222", "S3FE0", "Z92193123931")),
                    Arguments.of(false, "[a-zA-Z]+\\d+", Arrays.asList("1eg", "1235grergreg2", "Слова234", "1Цифра и слова", "123")),


                    //matches([^abc]+) ^ отрицает наличие символа в строке
                    Arguments.of(true, "[^abc]+", Arrays.asList("sdwdw12", "1234", "Слово", "SFFE0", "Z92193123931")),
                    Arguments.of(false, "[^abc]+", Arrays.asList("aСлово", "123456b", "c++", "a1Цифра и слова", "Словов а затем abc")),


                    //. - Точка обозначает любой символ
                    //matches("http://www\\..+\\.(com|ru)") ^ определяет является ли строка валидным сайтом
                    Arguments.of(true, "http://www\\..+\\.(com|ru)", Arrays.asList("http://www.google.com", "http://www.mail.ru", "http://www.cinema.ru")),
                    Arguments.of(false, "http://www\\..+\\.(com|ru)", Arrays.asList("http://wwww.google.com", "http://www.google.net", "wwww.google.com", "httttp://www.google.com")),

                    //matches (\\d{2,4})   {2, 4}    -  (\\d{2,4}) - от 2 до 4 символов до
                    Arguments.of(true, "\\d{2,4}", Arrays.asList("12", "1234", "123")),
                    Arguments.of(false, "\\d{2,4}", Arrays.asList("1", "12345", "123123123", "a12Цифра и слова", "Слово 12")),


                    //matches(\w)  \\w - одна буквы (любая) ==     [^a-zA-Z0-9]
                    Arguments.of(true, "\\w", Arrays.asList("n", "W", "1", "0", "r")),
                    Arguments.of(false, "\\w", Arrays.asList("nn", "!", "-", "п", "я"))

            );
        }
    }

    @ParameterizedTest(name = "Тест метода ввода с двумя вводами")
    @ArgumentsSource(ValuesToCompareRegexp.class)
    public void multipleInputsTest(boolean bool, String regexp, List<String> examples) {
        System.out.println("При regexp " + notReg(regexp) + " " + bool + " для: " + examples);
        for (String val : examples) {
            //System.out.println(val + " --> "+ val.matches(regexp));
            Assertions.assertEquals(bool, val.matches(regexp));
        }
    }


    @Test
    public void matchesComparisonOfTwoStrings123() {
        String string = "12345";
        String equalString = "12345";
        String notEqualString = "123";

        //matches позволяет сравнить строки
        Assertions.assertEquals(true, string.matches(equalString));
        Assertions.assertEquals(false, string.matches(notEqualString));
    }

    @Test
    public void matchesComparisonOfTwoStringsHello() {
        String string = "hello";
        String equalString = "hello";
        String notEqualString = "wello";

        //matches позволяет сравнить строки
        Assertions.assertEquals(true, string.matches(equalString));
        Assertions.assertEquals(false, string.matches(notEqualString));

    }
}
