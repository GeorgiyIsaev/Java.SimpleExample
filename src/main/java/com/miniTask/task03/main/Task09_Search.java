package com.miniTask.task03.main;


import java.util.Arrays;
import java.util.Random;

//| 9 | Количество сравнений |
// Реализуйте int binarySearchCount(int[] a,int key)
// — возвращает, сколько сравнений понадобилось
// для успешного поиска. Выведите сравнения
// для массивов 1 000, 10 000, 100 000 элементов. |
public class Task09_Search {
    private static final int MAX_VALUE = 100;
    private static  final int FIND_ELEMENT = 5;

    public static void main(String[] args) {
        printCountIterationToFind(1000);
        printCountIterationToFind(1000);
        printCountIterationToFind(10000);
        printCountIterationToFind(10000);
        printCountIterationToFind(100000);
        printCountIterationToFind(100000);

    }
    public static void printCountIterationToFind(int sizeArray){
        int[] ints = randomFilling(sizeArray, MAX_VALUE);
        int countIteration = binarySearchCount(ints, FIND_ELEMENT);
        System.out.println("Размер массива: " + ints.length + " потребовалось итерацией: " + countIteration);
    }



    public static int[] randomFilling(int size, int maxValue){
        int[] ints = new int[size];
        Random rand = new Random();
        for(int i=0; i<size; i++){
            ints[i] = rand.nextInt(maxValue);
        }
        return ints;
    }
    public static int binarySearchCount(int[] arr,int key){
        int countIteration = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int findID = -1;

        while(firstIndex <= lastIndex) {
            countIteration++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == key) {
                findID = middleIndex;
                break;
            }
            else if (arr[middleIndex] < key)
                firstIndex = middleIndex + 1;

            else if (arr[middleIndex] > key)
                lastIndex = middleIndex - 1;
        }
        if(findID == -1){
            System.out.println("Элемент не найден");
        }
        else {
            System.out.println("Индекс Элемента: " +findID);
        }
        return countIteration;
    }


}
