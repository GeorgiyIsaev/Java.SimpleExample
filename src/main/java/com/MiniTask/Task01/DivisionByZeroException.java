package com.MiniTask.Task01;

public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException(){
        super("Нельзя делить на ноль");
    }
}
