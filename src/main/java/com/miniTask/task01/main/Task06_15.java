package com.miniTask.task01.main;

import com.miniTask.task01.figure.Rectangle;
import com.miniTask.task01.figure.Square;

import java.util.ArrayList;
import java.util.List;

public class Task06_15 {
    public static void main(String[] args) {
        //| 6 | Классы и объекты | Создайте класс Rectangle с полями width, height, методами area() и perimeter(). |
        //| 7 | Поля/методы | В Rectangle добавьте счётчик созданных экземпляров (static int counter). |
        //| 8 | Конструкторы | Перегрузите конструкторы: без аргументов (1×1) и с двумя аргументами. |
        //| 9 | Модификаторы доступа | Сделайте поля private, добавьте getWidth/Height и setWidth/Height с проверкой, что значение > 0. |
        //| 10 | Инкапсуляция | Перепроверьте, что прямой доступ к полям запрещён; исправьте, если нет. |
        //| 11 | Наследование | Наследуйте Square от Rectangle, конструктор принимает только side. |
        //| 12 | Полиморфизм | Сформируйте List<Rectangle> из 3 Rectangle и 2 Square, вызовите area() у всех. |
        //| 13 | this / super | В конструкторе Square вызовите конструктор суперкласса через super. |
        //| 14 | Перегрузка / переопределение | Перегрузите setWidth(double) в Square, чтобы одновременно менять и ширину, и высоту. |
        //| 15 | toString() | Переопределите toString() у обоих классов, чтобы вывод был Rectangle(3×4) / Square(5). |
        printFigures();
    }
    public static List<Rectangle> createListRectangle(){
        List<Rectangle> figures = new ArrayList<>();
        figures.add(new Rectangle(2,6));
        figures.add(new Square(6));
        figures.add(new Rectangle(3,4));
        figures.add(new Square(3));
        figures.add(new Rectangle(12,7));
        return figures;
    }
    public static void printFigures(){
        List<Rectangle> figures = createListRectangle();
        for(Rectangle figure : figures){
            System.out.print("figure: " + figure);
            System.out.print(" S = " + figure.area());
            System.out.println(" P = " + figure.perimeter());
        }
    }
}
