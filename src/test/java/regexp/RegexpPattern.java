package regexp;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpPattern {

    @Test
    public void test1(){
        String text = "He is email Gornak@gmail.com find not pleaz." +
                "The bridge spanning a 100-foot gully stood in front of him " +
                "as the last obstacle blocking him from reaching his destination. " +
                "While people may have called it a \"bridge\", the reality was " +
                "it was nothing more than splintered wooden planks held together " +
                "by rotting ropes. It was questionable whether it would hold the " +
                "weight of a child, let alone the weight of a grown man. " +
                "my address: tem@yandex.ru. Let's stay touch... ";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.((com)|ru)");
        //В матчер передает матчер из паттерна
        Matcher matcher = email.matcher(text);

       // while(matcher.find()){
            //group() возвращает то что было найдено
        //  System.out.println(matcher.group());
       // }

        while(matcher.find()){
            //То что заключено в () называется группой (\w+) -1 (gmail|yandex) -2 (com|ru) -3
            //group() возвращает то что было найдено
            System.out.println("It find: " + matcher.group());
            System.out.println("It find 0: " + matcher.group(0));
            System.out.println("It find 1: " + matcher.group(1));
            System.out.println("It find 2: " + matcher.group(2));
            System.out.println("It find 3: " + matcher.group(3));
            System.out.println("It find 4: " + matcher.group(4));
        }

    }
}
