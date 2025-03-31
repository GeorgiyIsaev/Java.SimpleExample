package com.Algorithms.SortQuick;

import java.util.Arrays;
import java.util.Random;

public class SortQuick {
    public static void main(String[] args) {
        int[] array = createRandomArray(20);
        System.out.println(Arrays.toString( array));
        array = sortArray(array, 0,array.length-1);
        System.out.println(Arrays.toString( array));

    }
    public static int[] createRandomArray(int size){
        int [] array = new int[size];
        Random rand = new Random();
        for(int i=0; i<size; i++){
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    public static int[] sortArray(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            sortArray(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            sortArray(array, leftBorder, rightMarker);
        }
        return array;
    }
}
