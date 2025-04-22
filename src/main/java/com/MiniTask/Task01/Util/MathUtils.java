package com.MiniTask.Task01.Util;

public  class MathUtils {
    public static int gcd(int a,int b){
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
