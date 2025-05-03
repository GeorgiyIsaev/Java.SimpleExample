package com.miniTask.task01.main;

import com.miniTask.task01.figure.IMovable;
import com.miniTask.task01.figure.Rectangle;
import com.miniTask.task01.figure.Square;

import java.util.ArrayList;
import java.util.List;

public class Task25 {
    public static void main(String[] args) {
        //| 25 | Интерфейсы | Опишите интерфейс Movable с move(int dx,int dy). Реализуйте его в Rectangle. |
        printFigures();
    }
    public static List<IMovable> createListRectangle(){
        List<IMovable> figures = new ArrayList<>();
        figures.add(new Rectangle(2,6));
        figures.add(new Square(6));
        figures.add(new Rectangle(3,4));
        figures.add(new Square(3));
        figures.add(new Rectangle(12,7));
        return figures;
    }

    public static void printFigures(){
        List<IMovable> figures = createListRectangle();
        for(IMovable figure : figures){
            System.out.print("figure" + figure);
            figure.move(2,5);
            System.out.println(" -> figure move (2, 5): " + figure);
        }
    }


    }

