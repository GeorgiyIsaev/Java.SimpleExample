package com.miniTask.task02.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test04 {
    //| 4 | LinkedList vs ArrayList | Измерьте (System.nanoTime) время
    // вставки 10_000 элементов в начало ArrayList и LinkedList, выведите результаты. |
    public static void main(String[] args) {
        testAddToEndOfCollection();
        testAddToBeginningOfCollection();
    }
    public static void addToListRandom(List<Integer> list) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            list.add(rnd.nextInt());
        }
    }
    public static void addId0ToListRandom(List<Integer> list) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            list.add(0, rnd.nextInt());
        }
    }
    public static void testAddToBeginningOfCollection(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTime, endTime, duration;

        System.out.println("Добавление в начало");
        startTime = System.nanoTime();
        addId0ToListRandom(arrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        System.out.println("Count element in arrayList: " + arrayList.size());
        startTime = System.nanoTime();
        addId0ToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);
        System.out.println("Count element in linkedList: " + linkedList.size());
    }

    public static void testAddToEndOfCollection() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTime, endTime, duration;

        System.out.println("Добавление в конец");
        startTime = System.nanoTime();
        addToListRandom(arrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        System.out.println("Count element in arrayList: " + arrayList.size());
        startTime = System.nanoTime();
        addToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);
        System.out.println("Count element in linkedList: " + linkedList.size());
    }
}
