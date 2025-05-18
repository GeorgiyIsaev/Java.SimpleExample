package com.miniTask.task03;


import java.util.Objects;

//| 3 | equals / hashCode | Для класса Book(id,title,author)
// переопределите методы так, чтобы равенство зависело 
// только от id. Докажите тестом, что HashSet<Book> не хранит дубликаты. | 
public class Book {
    private  int id;
    private  String title;
    private  String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "id: " + id + " (" + title + " : " + author +")";
    }
}
