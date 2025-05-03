package com.miniTask.task01.util;

public  class MathUtils {
    public static int gcd(int a,int b){
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
