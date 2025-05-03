package com.miniTask.task02.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
    //| 3 | Неизменяемые коллекции | Метод unmodifiableGrades(Map<String,Integer>)
    // возвращает read‑only карту. Проверьте, что put() бросает исключение. |
    public static void main(String[] args) {
        testUnmodifiableGrades();
    }
    public static Map<String, Integer> unmodifiableGrades(Map<String, Integer> stringIntegerMap) {
        return Collections.unmodifiableMap(stringIntegerMap);
    }
    public static void testUnmodifiableGrades() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Ключ 1", 1991);
        myMap.put("Ключ 2", 1992);
        myMap.put("Ключ 3", 1994);
        Map<String, Integer> myMap2 = unmodifiableGrades(myMap);

        try {
            myMap2.put("Ключ 4", 1991);
        } catch (Exception ex) {
            System.out.println("Ошибка возникавшая при попытки добавит в карту: " + ex);
        }
        try {
            myMap2.remove(0);
        } catch (Exception ex) {
            System.out.println("Ошибка возникавшая при попытки удалить из карту: " + ex);
        }

        System.out.println("myMap" + myMap);
        System.out.println("myMap2" + myMap2);

        myMap.put("Ключ 5", 1994);
        System.out.println("После добавления элемента в изменяемую карту, обе карты изменяются: ");
        System.out.println("myMap" + myMap);
        System.out.println("myMap2" + myMap2);
    }


}
