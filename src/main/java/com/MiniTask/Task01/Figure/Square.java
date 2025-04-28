package com.MiniTask.Task01.Figure;

public class Square extends Rectangle {
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
        int average = (dx + dy) / 2;
        this.height = this.height + average;
        this.width = this.width + average;
    }
}
