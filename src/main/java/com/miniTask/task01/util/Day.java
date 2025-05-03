package com.miniTask.task01.util;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend(){
        return this == Day.SATURDAY || this == Day.SUNDAY;
    }
}
