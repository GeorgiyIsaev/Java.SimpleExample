package com.MiniTask.Task01;

public class Square extends Rectangle{
    private Square(double sideA, double sideB){
        this.height = sideA;
        this.width = sideB;
    }
    public Square(double side){
        super(side,side);
    }
    @Override
    public void setWidth(double side){
        this.height = side;
        this.width = side;
    }

    @Override
    public void setHeight(double side) {
        setWidth(side);
    }
    @Override
    public String toString() {
        return "Square [" + this.width + "]";
    }
}
