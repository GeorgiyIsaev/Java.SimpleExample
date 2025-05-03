package com.miniTask.task01;

public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException(){
        super("Нельзя делить на ноль");
    }
}
