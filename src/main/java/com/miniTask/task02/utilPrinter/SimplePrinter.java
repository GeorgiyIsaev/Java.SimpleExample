package com.miniTask.task02.utilPrinter;

import com.miniTask.task02.utilConsole.IPrint;

public class SimplePrinter implements IPrintable {
    @Override
    public void print(String string) {
        System.out.print(string);
    }
}
