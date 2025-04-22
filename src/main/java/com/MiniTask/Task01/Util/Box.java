package com.MiniTask.Task01.Util;

public class Box<T> {
    T value;
    public Box( T value){
        this.value=value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
