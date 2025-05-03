package com.miniTask.task01.main;

public class Task01 {
    public static void main(String[] args) {
        //| 1 | Основы синтаксиса / main | Создайте проект, в main напечатайте строку
        // Hello, Java <версия JVM>! — версию возьмите из System.getProperty("java.version"). |
        System.out.println("Hello, Java <" +  System.getProperty("java.version") + ">");
    }
}
