package com.miniTask.task02.utilPrinter;

public interface IPrintable {
    void print(String string);
    default void println(String s) {
        print(s + "\n");
    }
}
