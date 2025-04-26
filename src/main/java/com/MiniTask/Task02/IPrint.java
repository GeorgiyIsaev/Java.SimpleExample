package com.MiniTask.Task02;

public interface IPrint {
    void print(String string);
    default void println(String s) {
        print(s + "\n");
    }
}
