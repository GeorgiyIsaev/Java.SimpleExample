package com.miniTask.task01.main;

import com.miniTask.task01.Address;
import com.miniTask.task01.DivisionByZeroException;
import com.miniTask.task01.Person;

public class Task24 {
    //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
    public static void main(String[] args) {
        //| 24 | Композиция | Класс Person содержит поле‑объект Address. Создайте экземпляр и выведите его toString(). |
        myPerson();
    }
    public static void myPerson(){
        Person person = new Person("Олег", new Address("Самолетная", 17));
        System.out.println("person: " + person);
    }


}
