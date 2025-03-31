package com.Algorithms.SearchJump;

import java.util.Arrays;


/*
* Поиск прыжками: Jump Search
Требует отсортированную коллекцию.
Прыгаем исключительно вперед на интервал sqrt(arraylength).
При достижении большего элемента начинается поиск между этим элементом и предыдущим.
Линейный поиск становится жизнеспособным.
Временная сложность: O(sqrt (N)).
Пространственная сложность:
*/

public class SearchJump {
    public static void main(String[] args) {
        int[] array = new int[] {4,7,2,8,4,9,5,1,3};
        int findNumber = 5;
        int index = jumpSearch(array,findNumber);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Индекс для числа " +  findNumber + ": " + index);
    }

    public static int jumpSearch(int[] integers, int elementToSearch) {

        int arrayLength = integers.length;
        int jumpStep = (int) Math.sqrt(integers.length);
        int previousStep = 0;

        while (integers[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int)(Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (integers[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (integers[previousStep] == elementToSearch)
            return previousStep;
        return -1;
    }
}
