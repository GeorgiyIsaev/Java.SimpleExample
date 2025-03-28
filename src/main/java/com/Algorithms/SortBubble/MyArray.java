package com.Algorithms.SortBubble;

import java.util.Random;

public class MyArray {
    public static int[] createRandomArray(int size){
        int [] array = new int[size];
        Random rand = new Random();

        for(int i=0; i<size; i++){
            array[i] = rand.nextInt(1000);
        }
        return array;
    }


    public static int[] sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }

    /*Сортировка пузырьком: Bubble Sort
    Скорость: (N^2) / 4 (очень медленный)
    1. Сравниваются две пары элементов стоящие друг с другом.
    2. Если первый элемент больше второго, меняем их местами.
    3. Доходим до конца, самый большой эл-т оказывается в самом конце.
    4. Во внутреннем цикле проверим эл-ты от 0 до предпоследнего.
    Важно. Массив будит сортироваться даже когда отсортирован.
    */
}
