package com.MiniTask.Task02;

import java.util.Scanner;

public class Scannable implements IScan{
    Scanner scanner;
   public Scannable(){
       scanner = new Scanner(System.in);
    }
    @Override
    public String scan() {
        return scanner.nextLine();
    }
}
