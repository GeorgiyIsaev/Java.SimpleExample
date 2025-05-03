package com.miniTask.task01.main;

public class Task02 {
    public static void main(String[] args) {
        //| 2 | Типы данных и переменные | Объявите переменные всех примитивных типов и выведите их максимальные/минимальные значения (исп. Integer.MAX_VALUE). |
        printPrimitiveLimit();
    }
    public  static  void printPrimitiveLimit(){
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
}
