package com.miniTask.task01.main;

import com.miniTask.task01.util.Day;

import java.util.Random;

public class Task16 {
    //| 16 | enum | Создайте enum Day, метод isWeekend(). В main перечислите все дни и распечатайте, выходной ли он. |
    public static void main(String[] args) {
        printDayIsWeekends();
    }
    public static void printDayIsWeekends(){
        System.out.println("MONDAY выходной?: " + Day.MONDAY.isWeekend());
        System.out.println("TUESDAY выходной?: " + Day.TUESDAY.isWeekend());
        System.out.println("WEDNESDAY выходной?: " + Day.WEDNESDAY.isWeekend());
        System.out.println("THURSDAY выходной?: " + Day.THURSDAY.isWeekend());
        System.out.println("FRIDAY выходной?: " + Day.FRIDAY.isWeekend());
        System.out.println("SATURDAY выходной?: " + Day.SATURDAY.isWeekend());
        System.out.println("SUNDAY выходной?: " + Day.SUNDAY.isWeekend());
    }
}
