package MiniTask03;

import com.miniTask.task03.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Task05_UnmodifiableTest {

    @Test
    public void copyUnmodifiableTest(){
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        System.out.println("integers: " + integers);

        List<Integer> noModIntegers =  new Utils<Integer>().copyUnmodifiable(integers);

        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            noModIntegers.add(5);
        });
        Assertions.assertThrows(UnsupportedOperationException.class, ()->{
            noModIntegers.remove(0);
        });
    }

}
