package com.SimpleExample.ReadWritiStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
/*Чтение и запись текста в файл*/

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*Путь к файлу*/
        String pathWindows = "C:\\myTest\\testFile.txt";
        String pathWindowsInApp = "myTestFolder\\newFolder\\testFile.txt";
        String separator = File.separator; //возвращает слеш соответсвующий OS
        String pathCrossApp =
                "myTestFolder" + separator + "newFolder" +
                        separator + "testFile2.txt";


        /*Запись - пересоздает файл*/
        File fileWrite = new File(pathCrossApp);
        PrintWriter pw = new PrintWriter(fileWrite);
        pw.println("Строка номер 1");
        pw.println("Строка номер 2");
        pw.println("Строка номер 3");
        pw.close();

        /*Чтение*/
        File fileRead = new File(pathCrossApp);
        Scanner scanner = new Scanner(fileRead);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        /*Чтение 2*/
        PrintWriter pw2 = new PrintWriter(new File(pathWindowsInApp));
        pw2.println("First second third");
        pw2.close();

        Scanner scanner2 = new Scanner(new File(pathWindowsInApp));
        String line = scanner2.nextLine();

        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        scanner2.close();
    }

}
