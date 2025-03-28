package com.SimpleExample.ReadWritiObjs;

import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*Сериализация, */
        WriteObject();
        /*Десериализация*/
        ReadObject();
    }

    private static void WriteObject(){
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Tom");
        Person person3 = new Person(3, "Mike");
        /*Класс Person должен реализовать
        интерфейс Serializable*/
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void ReadObject(){
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) ois .readObject();
            Person person2 = (Person) ois .readObject();
            Person person3 = (Person) ois .readObject();
            ois.close();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
