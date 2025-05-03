package com.miniTask.task01.main;

import com.miniTask.task01.DivisionByZeroException;


public class Task27_28 {
    public static void main(String[] args) {
        //| 27 | Исключения | Метод divide(int a,int b) бросает собственное DivisionByZeroException, если b==0. |
        printZeroException ();
        //| 28 | Пакеты / import | Разнесите figure, util, exceptions по пакетам; наведите порядок в import. |
        //Пакет "figure" and "util" созданы -> классы перераспределены!
    }
    public static void printZeroException(){
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
