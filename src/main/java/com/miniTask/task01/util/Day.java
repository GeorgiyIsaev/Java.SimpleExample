package com.miniTask.task01.util;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean isWeekend(){
//        if(this == Day.SATURDAY || this == Day.SUNDAY) {
//            return true;
//        }else {
//            return false;
//        }

        return this == Day.SATURDAY || this == Day.SUNDAY;
    }
}
