package com.MiniTask.Task01;

public class Rectangle {
    private static int counter;
    protected double width;
    protected double height;
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static int getCounter() {
        return counter;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double area(){
        return this.height * this.width ;
    }
    public double perimeter(){
        return this.height + this.width ;
    }

    public void setWidth(double side){
        this.width = side;
    }
    public void setHeight(double side){
        this.height = side;
    }

    @Override
    public String toString() {
        return "Rectangle [" +this.width +  "*" +this.height + "]";
    }
}
