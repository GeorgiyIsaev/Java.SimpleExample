package com.MiniTask.Task01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java <" +  System.getProperty("java.version") + ">");

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

        System.out.println("0 Градусов Цельсия это : " + toFahrenheit(0) + " F" );
        System.out.println("100 Градусов Цельсия это : " + toFahrenheit(100) + " F" );
        System.out.println("0 Градусов Цельсия это : " + toKelvin(0) + " K" );
        System.out.println("100 Градусов Цельсия это : " + toKelvin(100) + " K" );

        System.out.println("Grade 4 : " + grade(4));
        System.out.println("Факториал 12 : " + getFactorial(12));


        figures();

        dayIsWeekends();

        mycCollectionsArrayList();



    }
    public static int toFahrenheit(int celsius){
        //3 F = C × (9/5) + 32
        return celsius * (9/5) + 32;
    }
    public static int toKelvin(int celsius){
        //3
        return celsius + 273;
    }

    /**
     * Метод grade(int score) возвращает A…F по 5‑балльной шкале
     * @param grade
     * @return
     */
    public static char grade(int grade){
        //4
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

    public static int getFactorial(int f) {
        //5
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void figures(){
       //6-15
        List<Rectangle> figures = new ArrayList<>();
        figures.add(new Rectangle(2,6));
        figures.add(new Square(6));
        figures.add(new Rectangle(3,4));
        figures.add(new Square(3));
        figures.add(new Rectangle(12,7));

        for(Rectangle figure : figures){
            System.out.print("figure: " + figure);
            System.out.print(" S = " + figure.area());
            System.out.println(" P = " + figure.perimeter());
        }
    }
    public static void dayIsWeekends(){
        //16
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

    public static void mycCollectionsArrayList(){
        //17-18
        List<Integer> integerList = new ArrayList<>(Arrays.asList(createRandomArray(20)));
        System.out.println("ArrayList no sort: " + integerList);
        Collections.sort(integerList);
        System.out.println("ArrayList Sort:    " + integerList);

        Iterator<Integer> iter = integerList.iterator();
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number % 2 == 1) {
                iter.remove();
            }
        }
        System.out.println("ArrayList delete not even: " + integerList);
    }

    public static void mycCollectionsHashMap(){

    }


}
