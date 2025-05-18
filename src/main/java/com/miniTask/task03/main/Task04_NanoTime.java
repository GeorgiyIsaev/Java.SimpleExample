package com.miniTask.task03.main;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//| 4 | Big-O эксперимент | Замерьте System.nanoTime()-ом
// среднее время (n=1 000 реп.) удаления 5 000-го элемента
// из ArrayList<Integer> и LinkedList<Integer>.
// Выведите результаты в консоль. |
public class Task04_NanoTime {
    private static final int SIZE = 10000;
    private static final int ID_DELETE = 5000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("--> Заполнение ArrayList");
        leadTimeToFill(SIZE, arrayList);

        List<Integer> linkedList = new LinkedList<>();
        System.out.println("--> Заполнение LinkedList");
        leadTimeToFill(SIZE, linkedList);


        System.out.println("--> Удаление из ArrayList");
        leadTimeToDelete(ID_DELETE, arrayList);
        System.out.println("--> Удаление из LinkedList");
        leadTimeToDelete(ID_DELETE, linkedList);

        System.out.println("--> Удаление из ArrayList до " + ID_DELETE + " элементов.");
        leadTimeCutList(ID_DELETE, arrayList);
        System.out.println("--> Удаление из LinkedList до " + ID_DELETE + " элементов.");
        leadTimeCutList(ID_DELETE, linkedList);
    }




    public static void randomFilling(int size, List<Integer> list){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            list.add(rand.nextInt(1000));
        }
    }
    public static void leadTimeToFill (int size, List<Integer> list){
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        randomFilling(size, list);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах: " + duration);
        System.out.println("Количество Элементов: " + list.size());
    }

    public static void leadTimeToDelete (int id, List<Integer> list) {
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        list.remove(id);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах: " + duration);
        System.out.println("Количество Элементов: " + list.size());
    }

    public static void leadTimeCutList (int id, List<Integer> list) {
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        while (list.size() > id){
            list.remove(id);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах: " + duration);
        System.out.println("Количество Элементов: " + list.size());
    }

}
