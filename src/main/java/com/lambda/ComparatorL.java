package com.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorL {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("F");
        list.add("DO");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               if(o1.length() > o2.length()){
                    return -1;
                }
                else  if(o1.length() < o2.length()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println("Лист 1" + list);

        //Лямбда-выражение передается в сравнение
        list.sort((o1, o2) -> {
          if(o1.length() < o2.length()){
                return -1;
            }else  if(o1.length() > o2.length()){
                return 1;
            }else {
                return 0;
            }
        });
        System.out.println("Лист 2" + list);

        //Лямбда-выражения можно помещать в переменные
        Comparator<String> comparator = (o1, o2) -> {
            if(o1.length() < o2.length()) return -1;
            else  if(o1.length() > o2.length()) return 1;
            else return 0;
        };
        list.sort(comparator);

    }
}
