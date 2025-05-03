package com.myAlgorithms.sortQuick;

import java.util.Arrays;
import java.util.Random;

/*
* Быстрая сортировка: Quick Sort
1. В функцию помещаем массив, индекс начала и индекс конца массива.
2. Находим индекс середины массива (pivot - опора)
3. По очередной сравниваем элементы массивы с центральным эл-том. Пока не находим эл-т который больше центрального.
4. По очередной сравниваем элементы массивы с центральным эл-том. Пока не находим эл-т который меньше центрального. И сдвигаем левый маркер на -1.
5. Меняем два этих эл-та местами.
6. Выполняем перестановку до тех пор, пока все-элементы не будут отсортированы относительно опоры. Больше опоры направо, меньше опоры налево.
7. Если левый Маркер не дошел до правой границы, взываем рекурсию сортировки от левого маркера до правой границы массива.
8. Если правый Маркер не вернулся к началу границы, взываем рекурсию сортировки от левой границы до правого маркера.
Сложность сортировки: O(n log n).
Минусы: не является стабильным. Меняет одинаковые эл-ты местами если он были до точки опоры.
*/

public class SortQuick {
    public static void main(String[] args) {
        int[] array = createRandomArray(20);
        System.out.println(Arrays.toString( array));
        sortArray(array, 0, array.length - 1);
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
