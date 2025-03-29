package com.Algorithms.SortSelection;

import java.util.Arrays;
import java.util.Random;
/*Сортировка выбором: Selection Sort
1. Массив воображаемо делится на две массива. Отсортированный массив и неотсортированный массив
2. Первый элемент сравнивается с последним. Через два цикла.
3. Осуществляется поиск наименьшего значения
4. Первый эл-т меняется местами с самым наименьшим значением.
5. Этот эл-т становится частью отсортированного массива, процесс повторяется со следующего элемента.
Важно. При такой сортировке происходит обмен одинаковых значений, что плохо сказывается на производительности.
*/

public class SortSelection {
    public static void main(String[] args) {
        int[] array = createRandomArray(20);
        System.out.println(Arrays.toString( array));
        array = sortArray(array);
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

    public static int[] sortArray(int[] array){

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }

            }
            if(minInd!=i){
                int temp = array[left];
                array[left] = array[minInd];
                array[minInd] = temp;
            }
        }



        return array;
    }
}
