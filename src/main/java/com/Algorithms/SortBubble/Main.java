package com.Algorithms.SortBubble;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/*Сортрировка пузырьком */
public class Main {
    public static void main(String[] args) {
        int[] array = MyArray.createRandomArray(10000);
        System.out.println(Arrays.toString(array));

        long start = System.nanoTime();
        int[] arraySort = MyArray.sortBubble(array);
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println(Arrays.toString(arraySort));
        System.out.println("Затрачено времени: " +  timeInMillis);
    }
}


