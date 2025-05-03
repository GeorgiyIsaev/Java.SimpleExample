package com.miniTask.task02;

public class ConsolePrinter implements IPrint{

    @Override
    public void print(String string) {
        System.out.print(string);
    }
}
