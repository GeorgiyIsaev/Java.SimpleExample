package researchOnJUnit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ConsoleInputTest {

    public void setUp(String command) {
        System.setIn(new ByteArrayInputStream(command.getBytes()));
    }
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
    @ParameterizedTest(name = "{index} - {0} is under 40")
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

}
