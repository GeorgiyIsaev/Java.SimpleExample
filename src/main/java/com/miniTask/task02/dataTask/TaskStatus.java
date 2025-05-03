package com.miniTask.task02.dataTask;

public enum TaskStatus {
    NEW("NEW"), IN_PROGRESS("IN_PROGRESS"),DONE("DONE"), BLOCKED("BLOCKED");
    private String name;
     TaskStatus(String name){
        this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }
    public  boolean canStart() {
        switch (this) {
            case NEW:
                return true;
            case BLOCKED:
            case DONE:
            case IN_PROGRESS:
            default:
                return false;
        }
    }
}
