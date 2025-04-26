package com.MiniTask.Task02;

import com.MiniTask.Task01.Figure.Figure;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        ConsolePrinter console = new ConsolePrinter();
        console.print("Строка 1; ");
        console.println("Строка 2; ");
        //2
        List<Figure> figures = new ArrayList<>();
        figures.add(ShapeFactory.ofRectangle(2,4));
        figures.add(ShapeFactory.ofSquare(5));
        console.println(figures.toString());
        //3
        testUnmodifiableGrades();

    }


    public static Map<String,Integer> unmodifiableGrades(Map<String,Integer> stringIntegerMap){
        return Collections.unmodifiableMap(stringIntegerMap);
    }
    public static void testUnmodifiableGrades(){
       //3
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("Ключ 1", 1991);
        myMap.put("Ключ 2", 1992);
        myMap.put("Ключ 3", 1994);
        Map<String,Integer> myMap2 =   unmodifiableGrades(myMap);

        try {
            myMap2.put("Ключ 1", 1991);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

}



