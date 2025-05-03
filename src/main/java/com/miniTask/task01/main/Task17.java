package com.miniTask.task01.main;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        printSortCollectionsArrayList();
    }
    //| 17 | Коллекции (общ.) | Сгенерируйте 20 случайных чисел в List<Integer>, отсортируйте, выведите. |
    public static Integer[] createRandomArray(int size) {
        Integer[] array = new Integer[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
    public static void printSortCollectionsArrayList(){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(createRandomArray(20)));
        System.out.println("ArrayList no sort: " + integerList);
        Collections.sort(integerList);
        System.out.println("ArrayList Sort:    " + integerList);
    }

}
