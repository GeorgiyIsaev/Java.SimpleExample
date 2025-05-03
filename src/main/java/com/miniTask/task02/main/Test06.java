package com.miniTask.task02.main;

import com.miniTask.task02.FileUtils;

import java.io.IOException;
import java.nio.file.Paths;

public class Test06 {
    //| 6 | Checked vs Unchecked | Напишите метод FileUtils.readText(Path p)
    // – он бросает IOException (checked). Вызовите его из main, отловите и выведите сообщение. |
    public static void main(String[] args) {
        workFiles();
    }
    public static void workFiles() {
        String text = "[ФАЙЛ НЕ НАЙДЕН!]";
        try {
            text = FileUtils.readText(Paths.get("Data\\testFile.txt."));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);
    }
}
