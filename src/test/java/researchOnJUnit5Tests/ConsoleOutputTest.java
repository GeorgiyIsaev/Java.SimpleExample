package researchOnJUnit5Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));

    }

    public void print(){
        System.out.print("hello");
    }

    @Test
    public void out() {
        print();
        Assertions.assertEquals("hello", outContent.toString());
    }


    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);

    }




}
