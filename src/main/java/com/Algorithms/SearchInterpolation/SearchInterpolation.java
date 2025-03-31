package com.Algorithms.SearchInterpolation;

import java.util.Arrays;

/*Интерполяционный поиск: Interpolation Search
Требуется отсортированный массив.
Требуется равномерно распределение данных в структуре.
Использует формулу интерполяции, что позволяет находить
    искомое число точнее. Это отличает его от бинарного поиска.
Временная сложность: O(log log N).
Временная сложность если данные не равномерно распроданы: O(N).
Пространственная сложность: O(1).
*/

public class SearchInterpolation {
    public static void main(String[] args) {
        int[] array = new int[] {11,22,33,45,56,68,79,89,100};
        int findNumber = 68;
        int index = interpolationSearch(array,findNumber);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Индекс для числа " +  findNumber + ": " + index);
    }
    public static int interpolationSearch(int[] integers, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex-startIndex) /
                    (integers[lastIndex]-integers[startIndex]))*
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return pos;

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }
}
