import com.miniTask.task02.dataTask.TaskStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiniTask02TaskStatusTest {
    //| 8 | JUnit 5 — параметризованный тест | Протестируйте canStart() из п.7
    // на всех значениях TaskStatus с @CsvSource. |
    @Test
    public void newTaskStatusForCanStartShouldHaveTrue(){
        TaskStatus taskStatus = TaskStatus.NEW;
        Assertions.assertTrue(taskStatus.canStart());
    }
    @Test
    public void progressTaskStatusForCanStartShouldHaveFalse(){
        TaskStatus taskStatus = TaskStatus.IN_PROGRESS;
        Assertions.assertFalse(taskStatus.canStart());
    }
    @Test
    public void doneTaskStatusForCanStartShouldHaveFalse(){
        TaskStatus taskStatus = TaskStatus.DONE;
        Assertions.assertFalse(taskStatus.canStart());
    }
    @Test
    public void blockedTaskStatusForCanStartShouldHaveFalse(){
        TaskStatus taskStatus = TaskStatus.BLOCKED;
        Assertions.assertFalse(taskStatus.canStart());
    }

}
