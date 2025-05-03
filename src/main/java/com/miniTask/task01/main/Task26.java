package com.miniTask.task01.main;

import com.miniTask.task01.figure.Figure;
import com.miniTask.task01.figure.Rectangle;
import com.miniTask.task01.figure.Square;

import java.util.ArrayList;
import java.util.List;

public class Task26 {
    public static void main(String[] args) {
        //| 26 | Абстрактные классы | Абстрактный Figure c методом area(). Rectangle и Circle от него. |
        printFigures();
    }
    public static List<Figure> createListRectangle(){
        List<Figure> figures = new ArrayList<>();
        figures.add(new Rectangle(2,6));
        figures.add(new Square(6));
        figures.add(new Rectangle(3,4));
        figures.add(new Square(3));
        figures.add(new Rectangle(12,7));
        return figures;
    }
    public static void printFigures(){
        List<Figure> figures = createListRectangle();
        for(Figure figure : figures){
            System.out.print("figure: " + figure);
            System.out.print(" S = " + figure.area());
            System.out.println(" P = " + figure.perimeter());
        }
    }
}
