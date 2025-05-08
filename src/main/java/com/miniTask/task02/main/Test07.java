package com.miniTask.task02.main;

import com.miniTask.task02.dataTask.TaskStatus;

public class Test07 {
    // | 7 | enum + switch | Расширьте enum TaskStatus значением BLOCKED.
    //  Метод canStart(TaskStatus) возвращает true только для NEW. Используйте switch. |
    public static void main(String[] args) {
        workTaskStatus();
    }

    public static void workTaskStatus() {
        TaskStatus statusA = TaskStatus.IN_PROGRESS;
        System.out.println("Можем начать?: " + TaskStatus.canStart(statusA) + " Статус: " + statusA);

        TaskStatus statusB = TaskStatus.NEW;
        System.out.println("Можем начать?: " + TaskStatus.canStart(statusB) + " Статус: " + statusB);
    }
}
