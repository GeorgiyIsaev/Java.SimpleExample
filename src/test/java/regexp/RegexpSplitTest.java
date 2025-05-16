package regexp;

import org.junit.jupiter.api.Test;

public class RegexpSplitTest {
    @Test
    public void test(){
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(words);
    }


    @Test
    public void test2(){
        String a = "Hello.there.hey";
        String[] words = a.split("\\.");  //Точка специальный символ, его нужно экранировать
        System.out.println(words);
    }


    @Test
    public void test3(){
        String a = "Hello12312312there123123123hey";
        String[] words = a.split("\\d+");  //разделяем по цифрам
        System.out.println(words);
    }



    @Test
    public void test4(){
        //replace простая замена
        String a = "Hello there hey";
        String words = a.replace(" ", ".");
        System.out.println(words);
    }


    @Test
    public void test5(){
        //replaceAll замена регулярками
        String a = "Hello1231231231there122131223ey";
        String words = a.replaceAll("\\d+", "_");
        System.out.println(words);

        //заменяет только первое значение
        String words2 = a.replaceFirst("\\d+", "_");
        System.out.println(words2);
    }
}
