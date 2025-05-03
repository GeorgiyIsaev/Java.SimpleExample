package com.miniTask.task02.main;

import com.miniTask.task02.dataTask.Task;

public class Test05 {
    //| 5 | equals / hashCode | Переопределите эти методы в Task(id,name), чтобы new Task(1,"a").equals(new Task(1,"b")) было true. Покройте тестом. |
    public static void main(String[] args) {
        equalsTask();
    }
    public static void equalsTask() {
        Task task1 = new Task(1, "a");
        Task task2 = new Task(1, "b");
        if (task2.equals(task1)) {
            System.out.println(task1 + " == " + task2);
        } else {
            System.out.println(task1 + " != " + task2);
        }
    }
}
