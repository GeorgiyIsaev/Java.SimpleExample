package com.miniTask.task01.figure;

public class Square extends Rectangle implements IMovable {
    private Square(double sideA, double sideB){
        //Приватный Конструктор - запрет конструктора с двумя параметрами
    }
    public Square(double side){
        super(side,side);
    }
    @Override
    public void setWidth(double side){
        super.setHeight(side);
        super.setWidth(side);
    }
    @Override
    public void setHeight(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
        return "Square [" + this.getHeight()+ "]";
    }

    @Override
    public void move(int dx, int dy) {
        double average = (dx + dy) / 2.0;
        setHeight(getHeight() + average);
    }
}
