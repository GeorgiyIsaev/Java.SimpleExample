package com.Algorithms.SortInsertion;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*Сортировка вставками (Insertion Sort)
1. Массив делится на две массива. Отсортированный и не отсортированный.
2. Второй элемент сравнивается с первым, если он меньше, то они меняются местами.
3. Два отсортированы эл-та становятся частью отсортированного массива
4. Третий эл-те сравнивается со вторым, если он меньше, то происходит обмен, если нет, то сравниваются третий с первым.
5. Потурить пока весь массив не станет отсортированным.
В отличии от сортировки выбором не меняет одинаковые эл-ты. То есть является устойчивым.
*/

public class SortInsertion {
    public static void main(String[] args) {
        int[] array = createRandomArray(10);
        System.out.println(Arrays.toString(array));

        long start = System.nanoTime();
        int[] arraySort = sortArray(array);
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println(Arrays.toString(arraySort));
        System.out.println("Затрачено времени: " + timeInMillis);
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }


    private static int[] sortArray(int[] array) {
        for (int left = 0; left < array.length; left++) {

            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {

                    break;
                }
            }

            array[i + 1] = value;
        }

        return array;
    }

}
