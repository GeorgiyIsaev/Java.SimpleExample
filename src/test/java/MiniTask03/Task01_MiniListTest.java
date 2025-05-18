package MiniTask03;

import com.miniTask.task03.containers.MiniList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task01_MiniListTest {

    @Test
    public void addToMiniList(){
        MiniList<Integer> integers = new MiniList<>();
        integers.addLast(10);
        integers.addLast(22);
        integers.addLast(33);
        int shouldSize = 3;
        Assertions.assertEquals(shouldSize, integers.getSize());
    }

    @Test
    public void removeMiniList(){
        Integer element01 = 10;
        Integer element02 = 20;
        MiniList<Integer> integers = new MiniList<>();
        integers.addLast(element01);
        integers.addLast(element02);

        Assertions.assertEquals(element01, integers.removeFirst());
        Assertions.assertEquals(element02, integers.removeFirst());

        int shouldSize = 0;
        Assertions.assertEquals(shouldSize, integers.getSize());

    }
}
