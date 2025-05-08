import com.miniTask.task02.dataTask.TaskStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MiniTask02TaskStatusTest {
    //| 8 | JUnit 5 — параметризованный тест | Протестируйте canStart() из п.7
    // на всех значениях TaskStatus с @CsvSource. |
    @ParameterizedTest
    @CsvSource({
            "NEW, true",
            "IN_PROGRESS, false",
            "DONE, false",
            "BLOCKED, false"
    })
    public void taskStatusForCanStartIsBoolean(TaskStatus status, boolean isCan){
        Assertions.assertEquals(isCan, TaskStatus.canStart(status));
    }
}
