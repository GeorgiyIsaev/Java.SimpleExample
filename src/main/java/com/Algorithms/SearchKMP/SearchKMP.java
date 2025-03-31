package com.Algorithms.SearchKMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Алгоритм Кнута – Морриса – Пратта
Поиск текста по шаблону
Создается шаблон из поисковой строки
Для шаблона создаются префикс и суффикс
Шаблон используется для поиска
КМП работает быстрее алгоритма перебора благодаря пропускам.
Временная сложность: O (M + N) N-время поиска, M- время составления шаблона
Пространственная сложность: O(M) пространства необходимо для хранения скомпилированного шаблона для заданного шаблона размера M.
*/

public class SearchKMP
{
    public static void main(String[] args) {
        //String pattern = "AAABAAA";
        String pattern = "AAJF";
        String text = "ASBNSAAAAAABAAAAABAAAAAGAHUHDJKDDKSHAAJF";
        int[] compliedPatternArray = compilePatternArray(pattern);
        System.out.println("Шаблон: " + Arrays.toString(compliedPatternArray));
        List<Integer> foundIndexes = performKMPSearch(text, pattern);


        if (foundIndexes.isEmpty()) {
            System.out.println("Шаблон не найден в данной текстовой строке!");
        } else {
            System.out.println("Шаблон, найденный в данной текстовой строке в позициях " + foundIndexes.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }

    }

    public static List<Integer> performKMPSearch(String text, String pattern) {
        int[] compliedPatternArray = compilePatternArray(pattern);

        int textIndex = 0;
        int patternIndex = 0;

        List<Integer> foundIndexes = new ArrayList<>();

        while (textIndex < text.length()) {
            if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                patternIndex++;
                textIndex++;
            }
            if (patternIndex == pattern.length()) {
                foundIndexes.add(textIndex - patternIndex);
                patternIndex = compliedPatternArray[patternIndex - 1];
            }

            else if (textIndex < text.length() && pattern.charAt(patternIndex) != text.charAt(textIndex)) {
                if (patternIndex != 0)
                    patternIndex = compliedPatternArray[patternIndex - 1];
                else
                    textIndex = textIndex + 1;
            }
        }
        return foundIndexes;
    }
    public static int[] compilePatternArray(String pattern) {
        /*Метод для создания шаблона строки*/
        int patternLength = pattern.length();
        int len = 0;
        int i = 1;
        int[] compliedPatternArray = new int[patternLength];
        compliedPatternArray[0] = 0;

        while (i < patternLength) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                compliedPatternArray[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = compliedPatternArray[len - 1];
                } else {
                    compliedPatternArray[i] = len;
                    i++;
                }
            }
        }
        System.out.println("Скомпилированный массив шаблонов: " + Arrays.toString(compliedPatternArray));
        return compliedPatternArray;
    }
}
