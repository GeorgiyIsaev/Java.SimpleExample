package researchOnJUnit5Tests;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AssertionsTests {

    @Test
    public void CheckShouldCompareTwoArgumentsForEquality(){
        //Сравнивает два аргумента между собой!
        int a = 1;
        int b = 1;
        Assertions.assertSame(a,b);
    }

    @Test
    public void CheckShouldCompareTwoArgumentsForNotEquality(){
        //Сравнивает два аргумента между собой!
        int a = 1;
        int b = 100;
        Assertions.assertNotSame(a,b);
    }

    @Test
    public void CheckShouldCompareTwoObjectsForEquality(){
        //Проверка что два объекта равны
        String str1 = "Hello";
        String str2 = "Hello";
        Assertions.assertEquals(str1, str2, "Сообщение если проверка провалится");
    }

    @Test
    public void CheckShouldCompareTwoObjectsForNotEquality(){
        //Проверка что два объекта не равны
        String str3 = "Hello";
        String str4 = "No Hello";
        Assertions.assertNotEquals(str3, str4);
    }

    @Test
    public void CheckShouldCompareTwoArraysForEquality(){
        //Проверка сравнивает два массива
        int [] arr1 = new int[] {1,2};
        int [] arr2 = new int[] {1,2};
        Assertions.assertArrayEquals(arr1,arr2);
    }

    @Test
    public void CheckShouldCompareTwoIterationsForEquality(){
        //Две итерации равны между собой
        List<Integer> list1 =  new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 =  new ArrayList<>(Arrays.asList(1,2,3));
        Assertions.assertIterableEquals(list1,list2);
    }

    @Test
    public void TwoCollectionsOfShouldContainTheSameStrings(){
        //Две коллекции содержать одни и те же строки
        ArrayList<String> listStr1 = new ArrayList<>(Arrays.asList("one", "two"));
        ArrayList<String> listStr2 = new ArrayList<>(Arrays.asList("one", "two"));
        Assertions.assertLinesMatch(listStr2,listStr1);
    }

    @Test
    public void CheckShouldDetermineIfObjectIsNull(){
        //Проверяет что объект null
        Objects objNull = null;
        Assertions.assertNull(objNull);
    }

    @Test
    public void CheckShouldDetermineIfObjectIsNotNull(){
        //Проверяет что объект не null
        Object obj = new Object();
        Assertions.assertNotNull(obj);

    }

    @Test
    public void CheckShouldTheResultBeTrue(){
        //Проверяет что результат операции true
        Assertions.assertTrue(true);
    }
    @Test
    public void CheckShouldTheResultBeFalse(){
        //Проверяет что результат операции false
        Assertions.assertFalse(false);
    }

    @Test
    public void TheMethodShouldBeExecutedInTimeN(){
        //Метод должен быть выполнен за указанное время
        //Выполняет весь метод даже если не уложились во время
        Assertions.assertTimeout(Duration.ofMillis(500), () ->{
                    System.out.println("start");
                    //Thread.sleep(501);
                    System.out.println("finish");
                }
        );
    }

    @Test
    public void TheMethodShouldBeExecutedInTimeNWithInterruption(){
        //Метод должен быть выполнен за указанное время
        //Если время истекает,то выбрасывает Exeption и прерывает выполнение
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), () ->{
            System.out.println("start");
            //Thread.sleep(501);
            System.out.println("finish");
        });
    }

    @Test
    public void TheCheckShouldGetAnException(){
        //Проверяет что метод выбрасывает нужное исключение
        Assertions.assertThrows(NullPointerException.class, ()->{
            Objects objects= null;

            System.out.println( objects.toString());
        });
    }

    @Test
    public void TheCheckShouldFailTheTestIfTheConditionIsMet(){
        if(false) {
            //Роняет тест по вашему условию
            Assertions.fail();
        }
    }
}
