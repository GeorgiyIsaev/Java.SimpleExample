package com.lambda.changeCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Специальные методы можно вызвать несколько раз подряд
public class UseMany {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);

        //Вызываем фильтр а затем мап
        int[] newArr = Arrays.stream(arr).filter(value -> value % 2 == 0)
                .map(operand -> operand * 2).toArray();
        System.out.println(Arrays.toString(newArr));
    }
    public static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
