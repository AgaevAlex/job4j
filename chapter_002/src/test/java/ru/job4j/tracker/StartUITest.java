package ru.job4j.tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Тест проверяющий замену заявки в трекере
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 134L));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    /**
     * Тест проверяющий удаление заявки в трекере.
     */
    @Test
    public void whenDeleteThenTrackerHasDeleteItem() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявки
        Item item1 = tracker.add(new Item("test name1", "desc1", 1345L));
        Item item2 = tracker.add(new Item("test name2", "desc2", 1346L));
        Item item3 = tracker.add(new Item("test name3", "desc3", 1347L));
        Input input = new StubInput(new String[]{"3", item2.getId()});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("test name3"));

    }

    /**
     * Тест, который проверяет изменение заявки.
     */
    @Test
    public void whenReplaceItem() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявки
        Item item1 = tracker.add(new Item("test name1", "desc1", 1345L));
        Input input = new StubInput(new String[]{"2", item1.getId(), "Alexey", "Agaev"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item1.getId()).getName(), is("Alexey"));
    }

    /**
     * Тест, который пока что ничего не проверяет
     */
    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test name1", "desc1", 1345L));
        Input input = new StubInput(new String[]{"4", item1.getId()});
        new StartUI(input, tracker).init();
//      Данный метод не изменяет данные в Трекере, поэтому я не знаю как его проверить.

    }
}