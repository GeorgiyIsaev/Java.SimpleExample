package com.miniTask.task02;

import com.miniTask.task01.figure.Figure;
import com.miniTask.task01.figure.Rectangle;
import com.miniTask.task01.figure.Square;

public class ShapeFactory {
    private ShapeFactory(){}

    static Figure ofSquare(double side){
        return new Square(side);
    }
    static Figure ofRectangle(double w,double h){
        return  new Rectangle(w,h);
    }
}
