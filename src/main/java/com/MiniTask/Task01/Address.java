package com.MiniTask.Task01;

public class Address {
    String nameStreet;
    int numberHouse;
public Address(String nameStreet, int numberHouse){
    this.nameStreet = nameStreet;
    this.numberHouse = numberHouse;
}

    @Override
    public String toString() {
        return "{" +  nameStreet +  ", дом = " + numberHouse + '}';
    }
}
