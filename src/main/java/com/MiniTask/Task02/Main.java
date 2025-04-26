package com.MiniTask.Task02;

import com.MiniTask.Task01.Figure.Figure;

import java.util.ArrayList;
import java.util.List;

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
    }
}
