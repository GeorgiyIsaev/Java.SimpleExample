package com.lambda.changeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//reduce - сжимает в один элемент
public class UseReduce {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);


        int sumArr = Arrays.stream(arr).reduce((accumulator, element) ->accumulator + element+1).getAsInt();
        int sum = list.stream().reduce((accumulator, element) ->accumulator + element+1).get();
        int sum2 = list.stream().reduce(100,(accumulator, element) ->accumulator + element+1);

        System.out.println();
        System.out.println(sumArr);
        System.out.println(sum);
        System.out.println(sum2);
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
