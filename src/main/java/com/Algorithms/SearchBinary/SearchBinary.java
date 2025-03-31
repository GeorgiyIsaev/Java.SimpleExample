package com.Algorithms.SearchBinary;

import java.util.Arrays;

/*Двоичный поиск: Binary Search
Требуется отсортированный массив
Алгоритм делит массив на две половины.
Сравнивает искомое число с элементом в середине.
Если число не найдено, поиск начинается заново через рекурсию,
в той половине, которая соответствует условию больше или меньше.
*/

public class SearchBinary {
    public static void main(String[] args) {
        int[] array = new int[] {11,22,33,45,56,68,79,89,100};
        int findNumber = 68;
        int index = binarySearch(array,findNumber);

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Индекс для числа " +  findNumber + ": " + index);
    }
    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
