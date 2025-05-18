package com.miniTask.task03.containers;


public class Entry<K,T> {
    private K key;
    private T value;
    private Entry<K,T> next;
    private Entry<K,T> prev;

    public void setValue(T value) {
        this.value = value;
    }

    public Entry(K key, T value) {
        this.value = value;
        this.key = key;
    }
    public K getKey() {
        return key;
    }
    public T getValue() {
        return value;
    }
    public void setNext(Entry<K,T> next) {
        this.next = next;
    }
    public Entry<K,T> getNext() {
        return next;
    }
    public void setPrev(Entry<K,T> prev) {
        this.prev = prev;
    }
    public Entry<K,T> getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return "(" + key +
                ", " + value +
                ')';
    }
}