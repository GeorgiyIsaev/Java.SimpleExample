package com.MiniTask.Task02;

import com.MiniTask.Task01.Figure.Figure;
import com.MiniTask.Task01.Figure.Rectangle;
import com.MiniTask.Task01.Figure.Square;

public class ShapeFactory {
    private ShapeFactory(){}

    static Figure ofSquare(double side){
        return new Square(side);
    }
    static Figure ofRectangle(double w,double h){
        return  new Rectangle(w,h);
    }
}
