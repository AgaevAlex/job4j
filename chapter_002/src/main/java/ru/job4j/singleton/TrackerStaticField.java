package ru.job4j.singleton;

import ru.job4j.tracker.Item;

public class TrackerStaticField {
    private static TrackerStaticField instance;

    private TrackerStaticField() {
    }

    public static TrackerStaticField getInstance() {
        if (instance == null) {
            instance = new TrackerStaticField();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerStaticField tracker = TrackerStaticField.getInstance();
    }
}
