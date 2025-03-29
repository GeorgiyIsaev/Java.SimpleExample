package com.Algorithms.SortMerge;

import java.util.Arrays;
import java.util.Random;
/*Сортировка слияние: SortMerge
1. Разделяем массив на две равные части.
2. Продолжаем разделять массив через вызов рекурсии, пока в нем не будет только 1 элемент.
3. Возвращаем новый массив через слияние двух маленьких отсортированных
4.При сортировке:
4.1. Сравниваем первые эл-ты двух массивов.
4.2 Самый маленький эл-т помешаем новый массив на первую позицию
4.3 У массива из которого извлекли эл-т сдвигаем курсор
4.4. Сравниваем первый эл-т не тронутого массива и следующий эл-т массива из которого было осуществлено извлечение.
4.5. Если все эл-т одного из массивов уже перемещены все эл-ты другого массива идут последовательно.
4.6 Повторяем до завершения сортировки
Скорость сортировки: O(nLogn). Выгоден когда много значений.
*/
public class SortMerge {
    public static void main(String[] args) {
        int[] array = createRandomArray(6);
        System.out.println(Arrays.toString(array));

        int[] array2 =   sortArray(array);

        System.out.println(Arrays.toString(array2));

    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    public static int[] sortArray(int[] arrayA) {
        /*Разъединяем массив до 1*/
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        int[] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        int[] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        /*Соединяем массивы*/
        return mergeArray(arrayB, arrayC);
    }

    public static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] arrayC = new int[(arrayA.length + arrayB.length)];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length) {
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrayA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
            int val = 0;
        }


        return arrayC;
    }
}
