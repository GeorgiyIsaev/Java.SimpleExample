package com.miniTask.task01.main;

public class Task05 {
    public static void main(String[] args) {
        //| 5 | Циклы | Вычислите факториал числа, используя for, и сумму цифр числа, используя while. |
        System.out.println("Факториал 12 : " + getFactorial(12));
        System.out.println("Сумма цифр для числа 12 : " + getSumNumber(12));
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static int getSumNumber(int sum) {
        int result = 0;
        while(sum != 0){
            result += (sum % 10);
            sum/=10;
        }
        return result;
    }
}
