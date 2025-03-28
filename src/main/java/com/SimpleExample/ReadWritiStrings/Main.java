package com.SimpleExample.ReadWritiStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*Чтение и запись текста в файл*/

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //  Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();

        /*Запись*/
        File file = new File("testFile.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Строка номер 1");
        pw.println("Строка номер 2");
        pw.close();

        /*Чтение*/




    }

}
