package com.MiniTask.Task01;

import com.MiniTask.Task01.Figure.Rectangle;
import com.MiniTask.Task01.Figure.Square;
import com.MiniTask.Task01.Util.Box;
import com.MiniTask.Task01.Util.Constants;
import com.MiniTask.Task01.Util.Day;
import com.MiniTask.Task01.Util.MathUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //| 1 | Основы синтаксиса / main | Создайте проект, в main напечатайте строку Hello, Java <версия JVM>! — версию возьмите из System.getProperty("java.version"). |
        System.out.println("Hello, Java <" +  System.getProperty("java.version") + ">");

        //| 2 | Типы данных и переменные | Объявите переменные всех примитивных типов и выведите их максимальные/минимальные значения (исп. Integer.MAX_VALUE). |
        toMaxAndMin();

        //| 3 | Операторы | Напишите метод, переводящий градусы °C в °F и К. Проверьте на 0 °C и 100 °C. |
        testKelvinAndFahrenheit();

        //| 4 | if / switch | Метод grade(int score) возвращает A…F по 5‑балльной шкале. Реализуйте на switch, а диапазоны опишите в javadoc. |
        System.out.println("Grade 4 : " + grade(4));

        //| 5 | Циклы | Вычислите факториал числа, используя for, и сумму цифр числа, используя while. |
        System.out.println("Факториал 12 : " + getFactorial(12));
        System.out.println("Сумма цифр для числа 12 : " + getSumNumber(12));

        //| 6 | Классы и объекты | Создайте класс Rectangle с полями width, height, методами area() и perimeter(). |
        //| 7 | Поля/методы | В Rectangle добавьте счётчик созданных экземпляров (static int counter). |
        //| 8 | Конструкторы | Перегрузите конструкторы: без аргументов (1×1) и с двумя аргументами. |
        //| 9 | Модификаторы доступа | Сделайте поля private, добавьте getWidth/Height и setWidth/Height с проверкой, что значение > 0. |
        //| 10 | Инкапсуляция | Перепроверьте, что прямой доступ к полям запрещён; исправьте, если нет. |
        //| 11 | Наследование | Наследуйте Square от Rectangle, конструктор принимает только side. |
        //| 12 | Полиморфизм | Сформируйте List<Rectangle> из 3 Rectangle и 2 Square, вызовите area() у всех. |
        //| 13 | this / super | В конструкторе Square вызовите конструктор суперкласса через super. |
        //| 14 | Перегрузка / переопределение | Перегрузите setWidth(double) в Square, чтобы одновременно менять и ширину, и высоту. |
        //| 15 | toString() | Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5). |
        figures();

        //| 16 | enum | Создайте enum Day, метод isWeekend(). В main перечислите все дни и распечатайте, выходной ли он. |
        dayIsWeekends();

        //| 17 | Коллекции (общ.) | Сгенерируйте 20 случайных чисел в List<Integer>, отсортируйте, выведите. |
        mycCollectionsArrayList();

        //| 18 | ArrayList | Удалите из списка все нечётные числа (итерация индексов vs Iterator). |
        mycCollectionsArrayListDeleteNotEven();

        //| 19 | HashMap | Создайте Map<String,Integer>: имя продукта → кол‑во. Выведите все записи формата яблоки – 5 шт. |
        mycCollectionsHashMap();

        //| 20 | Generics | Напишите класс‑обёртку Box<T> с одним полем value, геттером и toString(). |
        boxT();

        //| 21 | Итерация | Выведите Map из п.19 тремя способами: по ключам, по значениям, по entrySet.
        //!!! (@непонятно требование в задаче)

        //| 22 | static | Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида. |
        mathUtilsGSD();

        //| 23 | final | Сделайте final class Constants с public static final double PI = 3.1415…. |
        System.out.println("Constants: " + Constants.PI);

        //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
        myPerson();

        //| 25 | Интерфейсы | Опишите интерфейс Movable с move(int dx,int dy). Реализуйте его в Rectangle. |
        //Интерфейс добавлен и имплементирован, расположен в пакете Figure
        // figures();

        //| 26 | Абстрактные классы | Абстрактный Figure c методом area(). Rectangle и Circle от него. |
        // Абстрактный классы Figure добавлен и имплементация, расположен в пакете Figure
        // figures();

        //| 27 | Исключения | Метод divide(int a,int b) бросает собственное DivisionByZeroException, если b==0. |
        zero();

        //| 28 | Пакеты / import | Разнесите figure, util, exceptions по пакетам; наведите порядок в import. |
        //Пакет Figure and Util созданы

        //| 29 | JUnit (база) | Тест‑кейс RectangleTest.area() проверяет, что new Rectangle(3,4).area()==12. Используйте JUnit 5. |
        //Выполнение в пакете test
    }

    //| 2 | Типы данных и переменные | Объявите переменные всех примитивных типов и выведите их максимальные/минимальные значения (исп. Integer.MAX_VALUE). |
    public  static  void toMaxAndMin(){
        System.out.println("Максимальный Int: " +Integer.MAX_VALUE);
        System.out.println("Минимальный Int: " +Integer.MIN_VALUE);
        System.out.println("Максимальный Long: " +Long.MAX_VALUE);
        System.out.println("Минимальный Long: " +Long.MIN_VALUE);
        System.out.println("Максимальный Short: " +Short.MAX_VALUE);
        System.out.println("Минимальный Short: " +Short.MIN_VALUE);
        System.out.println("Максимальный Double: " +Double.MAX_VALUE);
        System.out.println("Минимальный Double: " +Double.MIN_VALUE);
        System.out.println("Максимальный Float: " +Float.MAX_VALUE);
        System.out.println("Минимальный Float: " +Float.MIN_VALUE);
        System.out.println("Максимальный Char: " +Character.MAX_VALUE);
        System.out.println("Минимальный Char: " +Character.MIN_VALUE);
        System.out.println("Максимальный Byte: " +Byte.MAX_VALUE);
        System.out.println("Минимальный Byte: " +Byte.MIN_VALUE);
    }

    //| 3 | Операторы | Напишите метод, переводящий градусы °C в °F и К. Проверьте на 0 °C и 100 °C. |
    public static double toFahrenheit(double celsius){
        //3 F = C × (9/5) + 32
        return celsius * (9.0/5) + 32;
    }
    public static int toKelvin(int celsius){
       return celsius + 273;
    }
    public static void testKelvinAndFahrenheit(){
        System.out.println("0 Градусов Цельсия это : " + toFahrenheit(0) + " F" );
        System.out.println("100 Градусов Цельсия это : " + toFahrenheit(100) + " F" );
        System.out.println("0 Градусов Цельсия это : " + toKelvin(0) + " K" );
        System.out.println("100 Градусов Цельсия это : " + toKelvin(100) + " K" );
    }

    //| 4 | if / switch | Метод grade(int score) возвращает A…F по 5‑балльной шкале. Реализуйте на switch, а диапазоны опишите в javadoc. |
    /**
     * Метод grade(int score) возвращает A…F по 5‑балльной шкале
     * @param grade (from 1 to 5)
     * @return char grade
     */
    public static char grade(int grade){
        switch (grade){
            case 5:
                return 'A';
            case 4:
                return 'B';
            case 3:
                return 'C';
            case 2:
                return 'D';
            case 1:
                return 'F';
        }
        return 'N';
    }

    //| 5 | Циклы | Вычислите факториал числа, используя for, и сумму цифр числа, используя while. |
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static int getSumNumber(int sum) {
        int result = 0;
        while(sum != 0){
            result += (sum % 10);
            sum/=10;
        }
        return result;
    }


    //| 6 | Классы и объекты | Создайте класс Rectangle с полями width, height, методами area() и perimeter(). |
    //| 7 | Поля/методы | В Rectangle добавьте счётчик созданных экземпляров (static int counter). |
    //| 8 | Конструкторы | Перегрузите конструкторы: без аргументов (1×1) и с двумя аргументами. |
    //| 9 | Модификаторы доступа | Сделайте поля private, добавьте getWidth/Height и setWidth/Height с проверкой, что значение > 0. |
    //| 10 | Инкапсуляция | Перепроверьте, что прямой доступ к полям запрещён; исправьте, если нет. |
    //| 11 | Наследование | Наследуйте Square от Rectangle, конструктор принимает только side. |
    //| 12 | Полиморфизм | Сформируйте List<Rectangle> из 3 Rectangle и 2 Square, вызовите area() у всех. |
    //| 13 | this / super | В конструкторе Square вызовите конструктор суперкласса через super. |
    //| 14 | Перегрузка / переопределение | Перегрузите setWidth(double) в Square, чтобы одновременно менять и ширину, и высоту. |
    //| 15 | toString() | Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5). |
    public static List<Rectangle> createListRectangle(){
        List<Rectangle> figures = new ArrayList<>();
        figures.add(new Rectangle(2,6));
        figures.add(new Square(6));
        figures.add(new Rectangle(3,4));
        figures.add(new Square(3));
        figures.add(new Rectangle(12,7));
        return figures;
    }
    public static void figures(){
        List<Rectangle> figures = createListRectangle();
        for(Rectangle figure : figures){
            System.out.print("figure: " + figure);
            System.out.print(" S = " + figure.area());
            System.out.print(" P = " + figure.perimeter());

            //25
            figures.get(0).move(2,5);
            System.out.println(" figure move (2, 5): " + figure);
        }
    }

    //| 16 | enum | Создайте enum Day, метод isWeekend(). В main перечислите все дни и распечатайте, выходной ли он. |
    public static void dayIsWeekends(){
        System.out.println("MONDAY выходной?: " + Day.MONDAY.isWeekend());
        System.out.println("TUESDAY выходной?: " + Day.TUESDAY.isWeekend());
        System.out.println("WEDNESDAY выходной?: " + Day.WEDNESDAY.isWeekend());
        System.out.println("THURSDAY выходной?: " + Day.THURSDAY.isWeekend());
        System.out.println("FRIDAY выходной?: " + Day.FRIDAY.isWeekend());
        System.out.println("SATURDAY выходной?: " + Day.SATURDAY.isWeekend());
        System.out.println("SUNDAY выходной?: " + Day.SUNDAY.isWeekend());
    }
    public static Integer[] createRandomArray(int size) {
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    //| 17 | Коллекции (общ.) | Сгенерируйте 20 случайных чисел в List<Integer>, отсортируйте, выведите. |
     public static void mycCollectionsArrayList(){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(createRandomArray(20)));
        System.out.println("ArrayList no sort: " + integerList);
        Collections.sort(integerList);
        System.out.println("ArrayList Sort:    " + integerList);
    }

    //| 18 | ArrayList | Удалите из списка все нечётные числа (итерация индексов vs Iterator). |
    public static void mycCollectionsArrayListDeleteNotEven(){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(createRandomArray(20)));
        System.out.println("ArrayList: " + integerList);
        Iterator<Integer> iter = integerList.iterator();
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number % 2 == 1) {
                iter.remove();
            }
        }
        System.out.println("ArrayList delete not even: " + integerList);
    }

    //| 19 | HashMap | Создайте Map<String,Integer>: имя продукта → кол‑во. Выведите все записи формата яблоки – 5 шт. |
    public static void mycCollectionsHashMap(){
        Map<String,Integer> products = new HashMap<>();
        products.put("хлеб", 2);
        products.put("молоко", 1);
        products.put("яблоки", 5);
        products.put("апельсины", 4);
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + " : "+ entry.getValue() + " шт.");
        }
    }

    //| 20 | Generics | Напишите класс‑обёртку Box<T> с одним полем value, геттером и toString(). |
    public static void  boxT() {
        Box<String> stringBox = new Box<>("Строка");
        System.out.println("BOX: " + stringBox);
    }

    //| 22 | static | Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида. |
    public static void  mathUtilsGSD(){
        int a = 12;
        int  b = 5;
        int g = MathUtils.gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + g);
    }

    //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
    public static void myPerson(){
        Person person = new Person("Олег", new Address("Самолетная", 17));
        System.out.println("person: " + person);
    }

    public static void zero(){
        try {
            divide(2,0);
        }
        catch (DivisionByZeroException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static int divide(int a,int b){
        if(b == 0){
            throw new DivisionByZeroException();
        }
        return a/b;
    }




}
