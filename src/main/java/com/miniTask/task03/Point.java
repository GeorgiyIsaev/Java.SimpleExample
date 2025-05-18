package com.miniTask.task03;

//| 8 | Immutable объект | Сделайте final class Point
// с полями double x,y, только геттеры и без сеттеров.
// Напишите тест, доказывающий, что после создания
// координаты изменить нельзя. |

public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }
}
