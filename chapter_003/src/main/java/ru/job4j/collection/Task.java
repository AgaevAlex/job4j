package ru.job4j.collection;

public class Task {
    private String decs;
    private int priority;

    public Task(String decs, int priority) {
        this.decs = decs;
        this.priority = priority;
    }

    public String getDecs() {
        return decs;
    }

    public int getPriority() {
        return priority;
    }
}
