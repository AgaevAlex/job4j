package ru.job4j.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод дожен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() > element.getPriority()) {
                index++;
            }
        }

        this.tasks.add(index, task);

    }

    public Task take() {
        return tasks.poll();
    }
}
