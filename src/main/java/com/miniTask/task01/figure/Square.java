package com.miniTask.task01.figure;

public class Square extends Rectangle implements IMovable {
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

    @Override
    public void move(int dx, int dy) {
        double average = (dx + dy) / 2.0;
        this.height = this.height + average;
        this.width = this.width + average;
    }
}
