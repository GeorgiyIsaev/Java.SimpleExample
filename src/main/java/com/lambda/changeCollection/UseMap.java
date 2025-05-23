package com.lambda.changeCollection;

import java.util.*;
import java.util.stream.Collectors;

//Метод мап позволяет использовать
// специальный методы для изменения массивов
public class UseMap {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

//        for(int i=0; i<10;i++){
//            arr[i] =  arr[i] *2;
//            list.set(i, list.get(i)*2);
//        }

        arr =  Arrays.stream(arr).map(element ->  element *2 ).toArray();
        list =  list.stream().map(element ->  element *2).toList();

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        arr =  Arrays.stream(arr).map(element -> 3 ).toArray();
        System.out.println(Arrays.toString(arr));

        //Можно вызвать на любых коллекциях
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);

        Set<Integer> newSet = set.stream().map(a->a *3).collect(Collectors.toSet());
        System.out.println(newSet);
    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    public static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);

        }
    }


}
