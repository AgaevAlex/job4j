package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public enum TrackerEnum {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerEnum tracker = TrackerEnum.INSTANCE;
    }
}
