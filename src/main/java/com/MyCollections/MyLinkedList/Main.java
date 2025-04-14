package com.MyCollections.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        System.out.println(myLinkedList);

        System.out.println("Index 3: " +  myLinkedList.get(3));


    }
}
