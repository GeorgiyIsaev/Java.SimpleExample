package com.miniTask.task01.main;

public class Task03 {
    public static void main(String[] args) {
        //| 3 | Операторы | Напишите метод, переводящий градусы °C в °F и К. Проверьте на 0 °C и 100 °C. |
        printKelvinAndFahrenheit();
    }
    public static double toFahrenheit(double celsius){
        //3 F = C × (9/5) + 32
        return celsius * (9.0/5) + 32;
    }
    public static int toKelvin(int celsius){
        return celsius + 273;
    }
    public static void printKelvinAndFahrenheit(){
        System.out.println("0 Градусов Цельсия это : " + toFahrenheit(0) + " F" );
        System.out.println("100 Градусов Цельсия это : " + toFahrenheit(100) + " F" );
        System.out.println("0 Градусов Цельсия это : " + toKelvin(0) + " K" );
        System.out.println("100 Градусов Цельсия это : " + toKelvin(100) + " K" );
    }
}
