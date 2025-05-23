package com.lambda.changeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseForEach {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);


        //forEach - проходит по всему массиву
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
        System.out.println();
        list.stream().forEach(element -> System.out.print(element + " "));

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
