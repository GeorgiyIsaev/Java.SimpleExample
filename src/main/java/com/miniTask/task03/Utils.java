package com.miniTask.task03;

import java.util.Collections;
import java.util.List;

public class Utils<T> {
    public  List<T> copyUnmodifiable(List<T> src){
        return Collections.unmodifiableList(src);
    }
}
