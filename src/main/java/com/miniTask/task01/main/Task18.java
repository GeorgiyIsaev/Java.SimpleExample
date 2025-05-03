package com.miniTask.task01.main;

import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        //| 18 | ArrayList | Удалите из списка все нечётные числа (итерация индексов vs Iterator). |
        printDeleteNotEvenFromCollections();
    }
    public static Integer[] createRandomArray(int size) {
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
    public static void printDeleteNotEvenFromCollections(){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(createRandomArray(20)));
        System.out.println("ArrayList: " + integerList);
        Iterator<Integer> iter = integerList.iterator();
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (number % 2 == 1) {
                iter.remove();
            }
        }
        System.out.println("ArrayList delete not even: " + integerList);
    }
}
