package com.miniTask.task02.figure;

public class ShapeFactory {
    private ShapeFactory(){}

    public static Figure ofSquare(double side){
        return new Square(side);
    }
    public static Figure ofRectangle(double w,double h){
        return  new Rectangle(w,h);
    }
}
