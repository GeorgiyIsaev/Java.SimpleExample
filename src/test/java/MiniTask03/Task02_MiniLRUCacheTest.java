package MiniTask03;

import com.miniTask.task03.containers.MiniLRUCache;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task02_MiniLRUCacheTest {
    @Test
    public void add(){
        Integer addInt = 1;
        String addText = "Строка";
        MiniLRUCache<Integer, String> integers = new MiniLRUCache();

        integers.put(addInt,addText);
        int shouldSize = 1;
        Assertions.assertEquals(shouldSize, integers.getSize());
    }

    @Test
    public void get(){
        Integer addInt = 1;
        String addText = "Строка";
        MiniLRUCache<Integer, String> integers = new MiniLRUCache();

        integers.put(addInt,addText);
        Assertions.assertEquals(addText, integers.get(addInt).getValue());
    }

    @Test
    public void remove(){
        Integer addInt = 1;
        String addText = "Строка";
        MiniLRUCache<Integer, String> integers = new MiniLRUCache();
        integers.put(addInt,addText);

        Assertions.assertEquals(addText, integers.remove().getValue());
        int shouldSize = 0;
        Assertions.assertEquals(shouldSize, integers.getSize());
    }
}
