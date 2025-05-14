package researchOnJUnit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ConsoleInputTest {

    /// Вводит что-то в консоль
    public void setUp(String command) {
        System.setIn(new ByteArrayInputStream(command.getBytes()));
    }

    ///Простой пример ввода
    public String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();
        System.out.println();
        return command;
    }
    @Test
    public void testYourMethodWithMockedInput() {
        String textTrue = "YourMockedInput";
        setUp(textTrue);
        String userInput = input();
        Assertions.assertEquals(textTrue, userInput);
        System.out.println("Ведена команда: " + userInput);
    }

    /// Тестирование метода с одним вводом
    public static class MyClassArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(Arrays.asList("БлокA", "01", "02")),
                    Arguments.of(Arrays.asList("БлокB", "001", "002","003","004")),
                    Arguments.of(Arrays.asList("БлокС", "0001"))
            );
        }
    }
    @ParameterizedTest(name = "Тест метода ввода с несколькими параметрами")
    @ArgumentsSource(MyClassArgumentsProvider.class)
    public void manyCommandTest(List<String> commands){
        if(!commands.isEmpty()){
            System.out.println(commands.get(0) + " количество команд:" + commands.size());
        }
        for(int i = 1; i<commands.size(); i++){
            String textTrue = commands.get(i);
            setUp(textTrue);
            String userInput = input();
            Assertions.assertEquals(textTrue, userInput);
            System.out.println("Ведена команда: " + userInput);

        }
    }

    ///  Тестирование метода с несколькими вводами
    public void inputPlus(int countCommand){
        String command = "Количество команд: " + countCommand;
        command+="\n";
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<countCommand; i++){
            System.out.print("Введите команду " + i +": ");
            command += scanner.nextLine();
            command+="--->>";
        }
        System.out.println(command);
    }
    public static class MyClassMultipleInputsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(Arrays.asList("БлокA", "БлокB>")),
                    Arguments.of(Arrays.asList("Команда1", "Команда2", "Команда3")),
                    Arguments.of(Arrays.asList("0001", "0002", "0003", "0004" , "0005"))
            );
        }
    }
    @ParameterizedTest(name = "Тест метода ввода с двумя вводами")
    @ArgumentsSource(MyClassMultipleInputsArgumentsProvider.class)
    public void multipleInputsTest(List<String> commands){
        String commandsFull = "";
          if(!commands.isEmpty()) {
              commandsFull = commands.get(0);
          }
        for(int i = 1; i<commands.size(); i++) {
            commandsFull +="\n";
            commandsFull += commands.get(i);
        }
        setUp(commandsFull);
        inputPlus(commands.size());
    }

}
