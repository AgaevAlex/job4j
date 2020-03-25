package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        System.out.println(autos);
        for (String auto : autos
        ) {
            System.out.println(auto);

        }
    }
}
