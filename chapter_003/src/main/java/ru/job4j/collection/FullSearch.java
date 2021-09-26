package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task1> lists) {
        HashSet<String> numbers = new HashSet<>();
        for (Task1 list : lists) {
            numbers.add(list.getNumber());
        }
        return numbers;
    }
}
