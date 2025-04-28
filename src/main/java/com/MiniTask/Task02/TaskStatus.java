package com.MiniTask.Task02;

public enum TaskStatus {
    NEW, IN_PROGRESS,DONE, BLOCKED;

    @Override
    public String toString() {
        switch (this){
            case NEW -> {return "NEW";}
            case IN_PROGRESS -> {return "IN_PROGRESS";}
            case DONE -> {return "DONE";}
            case BLOCKED -> {return "BLOCKED";}
            default -> {return "NON";}
        }
    }
    public  boolean canStart() {
        switch (this) {
            case BLOCKED:
                return false;
            case NEW:
                return false;
            case DONE:
                return false;
            case IN_PROGRESS:
                return true;
            default:
                return false;
        }
    }
}
