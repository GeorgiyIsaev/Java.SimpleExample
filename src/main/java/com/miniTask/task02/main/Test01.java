package com.miniTask.task02.main;

import com.miniTask.task02.utilConsole.ConsolePrinter;

public class Test01 {
    //| 1 | Интерфейсы 2.0 | Сделайте интерфейс Printer с print(String).
    // Добавьте default void println(String s){ print(s+"\n"); }. Реализуйте в классе ConsolePrinter. |
    public static void main(String[] args) {
          testConsolePrinter();
    }
     public static void testConsolePrinter() {
        ConsolePrinter console = new ConsolePrinter();
        console.print("Строка 1; ");
        console.println("");
        console.println("Строка 2; ");
    }

}
