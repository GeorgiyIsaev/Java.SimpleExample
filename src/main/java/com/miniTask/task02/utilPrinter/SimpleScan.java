package com.miniTask.task02.utilPrinter;

import java.util.Scanner;

public class SimpleScan implements IScannable {
    Scanner scanner;

    public SimpleScan() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String scan() {
        System.out.print("Введите текст в консоль: ");
        return scanner.nextLine();
    }
}
