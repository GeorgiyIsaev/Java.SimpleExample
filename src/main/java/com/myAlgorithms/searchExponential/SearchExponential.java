package com.myAlgorithms.searchExponential;

import java.util.Arrays;

/*Экспоненциальный поиск: Exponential Search.
Поиск диапазона, в котором может быть искомое число,
    осуществляется переход в экспоненциальные позиции.
Этот диапазон получается меньше, что ускоряет поиск.
Внутри диапазона поиск идет бинарным методом.
Коллекция должна быть отсортирована.
Временная сложность: O(log (N)).
Пространственная сложность: O(1)
Используется с большими массивами.
*/

public class SearchExponential {
    public static void main(String[] args) {
        int[] array = new int[] {11,22,33,45,56,68,79,89,100};
        int findNumber = 68;
        int index = exponentialSearch(array,findNumber);

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Индекс для числа " +  findNumber + ": " + index);
    }
    public static int exponentialSearch(int[] integers, int elementToSearch) {

        if (integers[0] == elementToSearch)
            return 0;
        if (integers[integers.length - 1] == elementToSearch)
            return integers.length;

        int range = 1;

        while (range < integers.length && integers[range] <= elementToSearch) {
            range = range * 2;
        }
        if (range == 0) //нельзя делить на ноль
            return -999999999;
        return Arrays.binarySearch(integers, range / 2, Math.min(range, integers.length), elementToSearch);
    }
}
