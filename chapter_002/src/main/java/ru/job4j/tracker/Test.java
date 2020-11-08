package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for ( int i =0; i <100; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println();
    }
}
