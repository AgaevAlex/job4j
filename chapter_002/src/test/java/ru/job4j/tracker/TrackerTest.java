package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void delete() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item next = new Item("test2", "testDescription2", 1234L);
        Item next2 = new Item("test3", "testDescription3", 12345L);
        Item next3 = new Item("test4", "testDescription4", 123455L);
        Item next4 = new Item("test5", "testDescription5", 1234555L);
        tracker.add(previous);
        tracker.add(next);
        tracker.add(next2);
        tracker.add(next3);
        tracker.add(next4);
        assertThat(tracker.delete(previous.getId()), is(true));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item next2 = new Item("test3", "testDescription3", 12345L);
        tracker.add(previous);
        tracker.add(next2);
        //не знаю как протестировать.
        assertThat(tracker.findAll(), is("test1"));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        Item previous2 = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        tracker.add(previous2);
        //не знаю как протестировать.
        assertThat(tracker.findByName("test1"), is("test1"));


    }
}