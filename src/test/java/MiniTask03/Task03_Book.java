package MiniTask03;

import com.miniTask.task03.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class Task03_Book {

    @Test
    public void equalsTest(){
        Book book1 = new Book(1,"Название", "Автор");
        Book book2 = new Book(1,"Другая книга", "Другой Автор");

        Assertions.assertEquals(book1,book2);

        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        int shouldSize = 1;
        Assertions.assertEquals(shouldSize, books.size());
    }
}
