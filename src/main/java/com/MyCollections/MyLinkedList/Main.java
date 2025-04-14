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

        System.out.println("Remove Index 4: " + myLinkedList.get(4));
        myLinkedList.remove(4);
        System.out.println(myLinkedList);

        System.out.println("Remove Index 0: " + myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        System.out.println("Remove Index 1: " + myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);

        System.out.println("Add Index 1: " + myLinkedList.get(1));
        myLinkedList.addIndex(1, 99);
        System.out.println(myLinkedList);
        System.out.println("Add Index 1: " + myLinkedList.get(1));
        myLinkedList.addIndex(1, 50);
        System.out.println(myLinkedList);
        System.out.println("Add Index 0: " + myLinkedList.get(0));
        myLinkedList.addIndex(0, 12);
        System.out.println(myLinkedList);

    }
}
