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

    private Node getNode (int index){
        int currentIndex = 0;
        Node temp = head;
        while(temp != null){
            if (currentIndex == index){
                return temp;
            }
            temp=temp.getNext();
            currentIndex++;
        }
        return null;
    }
    public int get(int index){
       Node currentNode = getNode(index);
       if(currentNode != null) {
           return currentNode.getValue();
       }
       throw new IllegalArgumentException();
    }
    public void remove(int index){
        if(index == 0){
           this.head = this.head.getNext();
           size--;
           return;
        }
        Node currentNode = getNode(index-1);
        if(currentNode != null) {
            currentNode.setNext(currentNode.getNext().getNext());
            size--;
            return;
        }
        throw new IllegalArgumentException();
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
