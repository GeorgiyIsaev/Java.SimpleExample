package com.miniTask.task01.main;

import com.miniTask.task01.util.Constants;
import com.miniTask.task01.util.MathUtils;

public class Task22 {
    public static void main(String[] args) {
        //| 22 | static | Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида. |
        mathUtilsGSD();
    }
    //| 22 | static | Сделайте утилитарный класс MathUtils с static gcd(int a,int b) — алгоритм Евклида. |
    public static void  mathUtilsGSD(){
        int a = 12;
        int  b = 5;
        int g = MathUtils.gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + g);
    }
}
