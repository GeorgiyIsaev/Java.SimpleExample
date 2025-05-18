package com.miniTask.task03.main;

import com.miniTask.task03.Utils;

import java.util.ArrayList;
import java.util.List;

//| 5 | Защитные коллекции | Напишите утилиту
// List<T> copyUnmodifiable(List<T> src).
// Проверьте, что add() к возвращённому
// списку кидает UnsupportedOperationException. |
public class Task05_Unmodifiable {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        System.out.println("integers: " + integers);

        List<Integer> noModIntegers =  new Utils<Integer>().copyUnmodifiable(integers);
        try {
            noModIntegers.add(5);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception: " + e);
        }
        try {
            noModIntegers.remove(0);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception: " + e);
        }

    }
}
