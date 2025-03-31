package com.Algorithms.SearchLine;
import java.util.Arrays;
/*Линейный поиск:
Перебор эл-тов по порядку. Если эл-та нет возвращает -1.
Временная сложность: O(N). (Чем больше эл-тов, тем дольше)
Пространственная сложность: O(1).  Всегда выполняется только одна операция.
Можно использовать на небольших неотсортированных массивах.
*/

public class SearchLine {
    public static void main(String[] args) {
        int[] array = new int[] {11,22,33,45,56,68,79,89,100};
        int findNumber = 68;
        int index = linearSearch(array,findNumber);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Индекс для числа " +  findNumber + ": " + index);
    }

    public static int linearSearch(int array[], int elementToSearch) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == elementToSearch)
                return index;
        }
        return -1;
    }
}
