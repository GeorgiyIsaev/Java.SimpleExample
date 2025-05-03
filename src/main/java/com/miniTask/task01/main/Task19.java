package com.miniTask.task01.main;

import java.util.HashMap;
import java.util.Map;

public class Task19 {
    public static void main(String[] args) {
        //| 19 | HashMap | Создайте Map<String,Integer>: имя продукта → кол‑во. Выведите все записи формата яблоки – 5 шт. |
        printCollectionsHashMap();
    }

    public static Map<String,Integer> createMapProducts(){
        Map<String,Integer> products = new HashMap<>();
        products.put("хлеб", 2);
        products.put("молоко", 1);
        products.put("яблоки", 5);
        products.put("апельсины", 4);
        return products;
    }

    public static void printCollectionsHashMap(){
        Map<String,Integer> products = createMapProducts();

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + " : "+ entry.getValue() + " шт.");
        }
    }
}
