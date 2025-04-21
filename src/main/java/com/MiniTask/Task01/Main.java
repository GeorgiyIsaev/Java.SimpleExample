package com.MiniTask.Task01;

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


//, Kelvin
    }
    public static int toFahrenheit(int celsius){
        //F = C × (9/5) + 32
        return celsius * (9/5) + 32;
    }
    public static int toKelvin(int celsius){
        return celsius + 273;
    }

    /**
     * Метод grade(int score) возвращает A…F по 5‑балльной шкале
     * @param grade
     * @return
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



}
