package com.MyCollections.MyLinkedList;
//Связанный список
//Добавление в конец
//Добавление по индексу
//Поиск по индексу
//Удаление по индексу


public class MyLinkedList {
    private Node head;
    private int size;

    public void add (int value){
        if (this.head == null){
            this.head = new Node(value);
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp=temp.getNext();

            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Node temp = head;
        while(temp != null){
            string.append(temp.getValue());

            if(temp.getNext() != null){
                string.append(",");
            }
            temp=temp.getNext();
        }
        string.append("]");
        return string.toString();
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
