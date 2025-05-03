package com.miniTask.task01.main;

public class Task04 {
    public static void main(String[] args) {
        //| 4 | if / switch | Метод grade(int score) возвращает A…F по 5‑балльной шкале. Реализуйте на switch, а диапазоны опишите в javadoc. |
        System.out.println("Grade 4 : " + grade(4));
    }
    /**
     * Метод grade(int score) возвращает A…F по 5‑балльной шкале
     * @param grade (from 1 to 5)
     * @return char grade
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
