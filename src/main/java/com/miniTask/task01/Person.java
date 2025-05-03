package com.miniTask.task01;

public class Person {
    String name;
    Address address;
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Адрес: " + address;
    }
}
