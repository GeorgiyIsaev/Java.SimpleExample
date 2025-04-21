package com.MiniTask.Task01;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend(){
        if(this == Day.SATURDAY || this == Day.SUNDAY) {
            return true;
        }
        else {
            return false;
        }
    }
}
