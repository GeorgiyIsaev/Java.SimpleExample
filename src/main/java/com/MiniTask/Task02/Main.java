package com.MiniTask.Task02;

import com.MiniTask.Task01.Figure.Figure;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        //4
        testNanoTime();
        //5
        equalsTask();
        //6
        workFiles();
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

    public static void testNanoTime(){
        //4
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Добавление в конец");
        long startTime = System.nanoTime();
        addToListRandom(arrayList);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        startTime = System.nanoTime();
        addToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);

        System.out.println("Добавление в начало");
        startTime = System.nanoTime();
        addId0ToListRandom(arrayList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для arrayList: " + duration);
        startTime = System.nanoTime();
        addId0ToListRandom(linkedList);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Время выполнения в наносекундах для linkedList: " + duration);




    }// list.add(0, element)
    public static void addToListRandom(List<Integer> list){
        Random rnd = new Random(System.currentTimeMillis());
        for(int i=0; i>10000; i++) {
            list.add(rnd.nextInt());
        }
    }
    public static void addId0ToListRandom(List<Integer> list){
        Random rnd = new Random(System.currentTimeMillis());
        for(int i=0; i>10000; i++) {
            list.add(0, rnd.nextInt());
        }
    }

    public static void equalsTask(){
       Task task1=        new Task(1,"a");
        Task task2=      new Task(1,"b");
       if(task2.equals(task1)){
           System.out.println(task1 + " == " + task2);
       }
       else{
           System.out.println(task1 + " != " + task2);
       }

    }

    public static void  workFiles(){
        String text ="";
        try {
             text = FileUtils.readText(Paths.get("Data\\testFile.txt."));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);
    }

}



