package com.miniTask.task03.main;

import com.miniTask.task03.Book;

import java.util.HashSet;

//| 3 | equals / hashCode | Для класса Book(id,title,author)
// переопределите методы так, чтобы равенство зависело
// только от id. Докажите тестом, что HashSet<Book> не хранит дубликаты. |
public class Task03_Book {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        System.out.println("books: " + books);
        Book book1 = new Book(0, "Название 1","Автор 1");
        books.add(book1);
        System.out.println("books after add 1: " + books);
        Book book2 = new Book(0, "Название 2","Автор 2");
        books.add(book2);
        System.out.println("books after add 2: " + books);

        Book book3 = new Book(3, "Название 3","Автор 3");
        books.add(book3);
        System.out.println("books after add 2: " + books);
    }
}
