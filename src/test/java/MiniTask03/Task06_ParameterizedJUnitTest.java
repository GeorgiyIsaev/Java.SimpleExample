package MiniTask03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class Task06_ParameterizedJUnitTest {

    public static Stream<Arguments> arrArguments() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 2}, new Integer[]{1, 2, 3}),
                Arguments.of(new Integer[]{4, 4, 4}, new Integer[]{4}));
    }
    @ParameterizedTest
    @MethodSource("arrArguments")
    void testWithMethodSource(Integer[] arrDub, Integer[] arrDeDub) {
        List<Integer> before = Arrays.asList(arrDub);
        List<Integer> shouldDeDub = Arrays.asList(arrDeDub);
        List<Integer> newBefore = dedup(before);
        Assertions.assertEquals(shouldDeDub, newBefore);
    }



   // @ParameterizedTest
  //  @CsvSource(value = {"1 2 3 2,1 3 2",
    //        "4 4 4,4"})
   // public void test(int[] arrDub, int[] arrDeDub){
       // System.out.println((arrDub));
        //System.out.println((arrDeDub));

    //     System.out.println(Arrays.toString(arrDub));
  //              System.out.println(Arrays.toString(arrDeDub));
   // }


    public static List<Integer> dedup(List<Integer> list){
        Set<Integer> deDub = new HashSet<>(list);
        List<Integer> integers  = new ArrayList<>();
        integers.addAll(deDub);
        return integers;
    }
}
