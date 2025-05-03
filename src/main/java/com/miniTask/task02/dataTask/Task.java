package com.miniTask.task02.dataTask;

public class Task {
    private int id;
    private String name;

    public Task(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + " -> " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return this.id == task.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
