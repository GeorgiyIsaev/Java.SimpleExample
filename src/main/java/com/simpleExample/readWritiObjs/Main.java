package com.simpleExample.readWritiObjs;

import java.io.*;
import java.util.Arrays;

public class Main {
    private transient int noSerializable;
    public static void main(String[] args) {
        /*Класс Person должен реализовать
        интерфейс Serializable*/
        /*Ключевое слов transient запретит сериализацию поля*/

        /*Сериализация, */
        WriteObject();
        /*Десериализация*/
        ReadObject();


        System.out.println(" ");
        WriteObjectArray();
        ReadObjectArray();

        System.out.println(" ");
        WriteObjectArrayObj();
        ReadObjectArrayObj();

    }

    private static void WriteObject(){
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Tom");
        Person person3 = new Person(3, "Mike");
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

    private static void WriteObjectArray(){
        Person[] peoples = {new Person(101,"Alisa"),
                new Person(102,"Lisa"),
                new Person(103,"Natasha" )};
        try {
            FileOutputStream fos = new FileOutputStream("people2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(peoples.length);
            for(Person person : peoples){
                oos.writeObject(person);
            }
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void ReadObjectArray(){
        try {
            FileInputStream fis = new FileInputStream("people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] persons = new Person[personCount];

            for(int i=0; i<personCount; i++){
                persons[i] =   (Person)ois.readObject();
            }
            System.out.println((Arrays.toString(persons)));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void WriteObjectArrayObj(){
        Person[] peoples = {new Person(101,"Alisa"),
                new Person(102,"Lisa"),
                new Person(103,"Natasha" )};
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people3.bin"));) {
            oos.writeObject(peoples);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void ReadObjectArrayObj(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people3.bin"))){
            Person[] persons =  (Person[]) ois.readObject();
            System.out.println((Arrays.toString(persons)));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
