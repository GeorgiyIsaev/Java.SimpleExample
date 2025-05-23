package com.lambda.changeCollection;

import java.util.*;

public class UseFilter {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);


        //filter method (фильтрация коллекции по условию)
        arr = Arrays.stream(arr).filter(element -> element % 2 == 0).toArray();
        list = list.stream().filter(element -> element % 2 == 0).toList();

        System.out.println(Arrays.toString(arr));
        System.out.println(list);








    }

    private static void fillArr(int[] arr) {
        for(int i=0; i<10;i++){
            arr[i] = i+1;
        }
    }

    private static void fillList(List<Integer> list) {
        for(int i=0; i<10;i++){
            list.add(i+1);
        }
    }
}
