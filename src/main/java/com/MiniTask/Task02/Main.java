package com.MiniTask.Task02;

import com.MiniTask.Task01.Figure.Figure;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //| 1 | Интерфейсы 2.0 | Сделайте интерфейс Printer с print(String). Добавьте default void println(String s){ print(s+"\n"); }. Реализуйте в классе ConsolePrinter. |
        System.out.println("\nЗАДАЧА 01:");
        testConsolePrinter();

        //| 2 | Статические фабрики | Создайте class ShapeFactory с static Figure ofSquare(double side) и ofRectangle(w,h). Запретите new ShapeFactory() через private конструктор. |
        System.out.println("\nЗАДАЧА 02:");
        testFigures();

        //| 3 | Неизменяемые коллекции | Метод unmodifiableGrades(Map<String,Integer>) возвращает read‑only карту. Проверьте, что put() бросает исключение. |
        System.out.println("\nЗАДАЧА 03:");
        testUnmodifiableGrades();

        //| 4 | LinkedList vs ArrayList | Измерьте (System.nanoTime) время вставки 10 000 элементов в начало ArrayList и LinkedList, выведите результаты. |
        System.out.println("\nЗАДАЧА 04:");
        testNanoTime();

        //| 5 | equals / hashCode | Переопределите эти методы в Task(id,name), чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. |
        System.out.println("\nЗАДАЧА 05:");
        equalsTask();

        //| 6 | Checked vs Unchecked | Напишите метод FileUtils.readText(Path p) – он бросает IOException (checked). Вызовите его из main, отловите и выведите сообщение. |
        System.out.println("\nЗАДАЧА 06:");
        workFiles();

        //| 7 | enum + switch | Расширьте enum TaskStatus значением BLOCKED. Метод canStart(TaskStatus) возвращает true только для NEW. Используйте switch. |
        System.out.println("\nЗАДАЧА 07:");
        workTaskStatus();

        //| 8 | JUnit 5 — параметризованный тест | Протестируйте canStart() из п.7 на всех значениях TaskStatus с @CsvSource. |
        // В пакете test

        //| 9 | Interface Segregation | Интерфейс SmartPrinter разделите на Printable (только print) и Scannable (scan). Класс SimplePrinter реализует только Printable. |


        //| 10 | Dependency Injection (лайт) | Класс OrderService принимает в конструкторе PaymentGateway gateway. В main создайте OrderService и передайте туда new PaypalGateway(). |
    }

    //| 1 | Интерфейсы 2.0 | Сделайте интерфейс Printer с print(String). Добавьте default void println(String s){ print(s+"\n"); }. Реализуйте в классе ConsolePrinter. |
    public static void testConsolePrinter() {
        ConsolePrinter console = new ConsolePrinter();
        console.print("Строка 1; ");
        console.println("Строка 2; ");
        System.out.println("");
    }

    //| 2 | Статические фабрики | Создайте class ShapeFactory с static Figure ofSquare(double side) и ofRectangle(w,h). Запретите new ShapeFactory() через private конструктор. |
    public static void testFigures() {
        List<Figure> figures = new ArrayList<>();
        figures.add(ShapeFactory.ofRectangle(2, 4));
        figures.add(ShapeFactory.ofSquare(5));
        System.out.println(figures);
    }


    //| 3 | Неизменяемые коллекции | Метод unmodifiableGrades(Map<String,Integer>) возвращает read‑only карту. Проверьте, что put() бросает исключение. |
    public static Map<String, Integer> unmodifiableGrades(Map<String, Integer> stringIntegerMap) {
        return Collections.unmodifiableMap(stringIntegerMap);
    }
    public static void testUnmodifiableGrades() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Ключ 1", 1991);
        myMap.put("Ключ 2", 1992);
        myMap.put("Ключ 3", 1994);
        Map<String, Integer> myMap2 = unmodifiableGrades(myMap);

        try {
            myMap2.put("Ключ 4", 1991);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            myMap2.remove(0);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("myMap" + myMap);
        System.out.println("myMap2" + myMap2);

        myMap.put("Ключ 5", 1994);

        System.out.println("myMap" + myMap);
        System.out.println("myMap2" + myMap2);
    }

    //| 4 | LinkedList vs ArrayList | Измерьте (System.nanoTime) время вставки 10 000 элементов в начало ArrayList и LinkedList, выведите результаты. |
    public static void addToListRandom(List<Integer> list) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i > 10000; i++) {
            list.add(rnd.nextInt());
        }
    }
    public static void addId0ToListRandom(List<Integer> list) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i > 10000; i++) {
            list.add(0, rnd.nextInt());
        }
    }
    public static void testNanoTime() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление в конец");
        long startTime = System.nanoTime();
        addToListRandom(arrayList);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        startTime = System.nanoTime();
        addToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);

        System.out.println("Добавление в начало");
        startTime = System.nanoTime();
        addId0ToListRandom(arrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        startTime = System.nanoTime();
        addId0ToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);
    }


    //| 5 | equals / hashCode | Переопределите эти методы в Task(id,name), чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. |
    public static void equalsTask() {
        Task task1 = new Task(1, "a");
        Task task2 = new Task(1, "b");
        if (task2.equals(task1)) {
            System.out.println(task1 + " == " + task2);
        } else {
            System.out.println(task1 + " != " + task2);
        }
    }

    //| 6 | Checked vs Unchecked | Напишите метод FileUtils.readText(Path p) – он бросает IOException (checked). Вызовите его из main, отловите и выведите сообщение. |
    public static void workFiles() {
        String text = "[ФАЙЛ НЕ НАЙДЕН!]";
        try {
            text = FileUtils.readText(Paths.get("Data\\testFile.txt."));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);
    }

    //| 7 | enum + switch | Расширьте enum TaskStatus значением BLOCKED. Метод canStart(TaskStatus) возвращает true только для NEW. Используйте switch. |
    public static void workTaskStatus() {
        TaskStatus statusA = TaskStatus.IN_PROGRESS;
        System.out.println("Можем начать?: " + statusA.canStart() + "Статус: " + statusA);

        TaskStatus statusB = TaskStatus.BLOCKED;
        System.out.println("Можем начать?: " + statusB.canStart() + "Статус: " + statusB);
    }



}



