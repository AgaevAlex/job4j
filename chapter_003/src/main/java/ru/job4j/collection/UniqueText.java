package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        int counter = 0;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String result : origin) {
            check.add(result);
        }
        for (String result : text) {
            if (!check.contains(result)) {
                return false;
            }
        }
        return true;
    }
}
