package com.miniTask.task02.dataTask;

public enum TaskStatus {
    NEW("NEW"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE"),
    BLOCKED("BLOCKED");

    private String name;
     TaskStatus(String name){
        this.name = name;
    }

    @Override
    public String toString() {
       return name;
    }
    public static boolean canStart(TaskStatus status) {
        return switch (status) {
            case NEW -> true;
            default -> false;
        };
    }


}
