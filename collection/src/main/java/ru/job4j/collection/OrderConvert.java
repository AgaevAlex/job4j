package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();

        for (Order orders1 : orders) {
            map.put(orders1.getNumber(), orders1);
            System.out.println(orders1);
        }
        return map;
    }
}
