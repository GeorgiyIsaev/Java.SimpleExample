package com.miniTask.task02.main;

import com.miniTask.task02.utilPrinter.IPrintable;
import com.miniTask.task02.utilPrinter.IScannable;
import com.miniTask.task02.utilPrinter.SimpleScan;
import com.miniTask.task02.utilPrinter.SimplePrinter;

public class Test09 {
    //| 9 | Interface Segregation | Интерфейс SmartPrinter разделите на Printable (только print)
    // и Scannable (scan). Класс SimplePrinter реализует только Printable. |
    public static void main(String[] args) {
        testInterfaceSegregation();
    }
    public static void testInterfaceSegregation(){
        IScannable scan= new SimpleScan();
        String inConsoleText = scan.scan();

        IPrintable print = new SimplePrinter();
        print.println("Текст с консоли: " + inConsoleText);
    }

}
