package ru.job4j.tracker;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    public String lineSeparator = System.lineSeparator();
    public StringBuilder menu1 = new StringBuilder()
            .append("0. Add new Item." + lineSeparator)
            .append("1. Show all items." + lineSeparator)
            .append("2. Edit item." + lineSeparator)
            .append("3. Delete item." + lineSeparator)
            .append("4. Find item by Id." + lineSeparator)
            .append("5. Find items by name." + lineSeparator)
            .append("6. Exit Program." + lineSeparator);
    //            .append("Select: " + lineSeparator);
    private Tracker tracker = new Tracker();
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    //    Не получилось
//    Item[] item = tracker.findAll();
    @Before
    public void loadStart() {
        tracker.add(new Item("test name1", "desc1", 1345L));
        tracker.add(new Item("test name2", "desc2", 1346L));
        tracker.add(new Item("test name3", "desc3", 1347L));
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[3].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    /**
     * Тест проверяющий замену заявки в трекере
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findAll()[0].getName(), is("test replace"));
    }

    /**
     * Тест проверяющий удаление заявки в трекере.
     */
    @Test
    public void whenDeleteThenTrackerHasDeleteItem() {
        Input input = new StubInput(new String[]{"3", tracker.findAll()[1].getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("test name3"));
    }

    /**
     * Тест, который проверяет изменение заявки.
     */
    @Test
    public void whenReplaceItem() {
        Input input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "Alexey", "Agaev", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("Alexey"));
    }

    /**
     * Тест, проверяющий вывод в консоль меню и пункт меню нахождение заявки по id.
     */
    @Test
    public void whenFindItemById() {
        Input input = new StubInput(new String[]{"4", tracker.findAll()[0].getId(), "6"});
        new StartUI(input, tracker).init();
        Item item = this.tracker.findAll()[0];
        StringBuilder menu = new StringBuilder();
        menu.append("------------ Нахождение заявки по Id --------------" + lineSeparator)
                .append("Заявка с данным id найдена.Name: " + item.getName() + " desc: " + item.getDecs() + lineSeparator);


        assertThat(
                new String(out.toByteArray()),
                is((menu1.toString() + menu.toString() + menu1.toString())
                ));

    }

    /**
     * Тест, проверяющий вывод в консоль меню и пункт меню нахождение заявки по имени.
     */

    @Test
    public void whenFindItemByName() {
        Input input = new StubInput(new String[]{"5", tracker.findAll()[0].getName(), "6"});
        new StartUI(input, tracker).init();
        Item item = this.tracker.findAll()[0];
        StringBuilder menu = new StringBuilder();
        menu.append("------------ Нахождение заявки по имени --------------" + lineSeparator)
                .append("Заявка с данным именем найдена: name: " + item.getName() + " id " + item.getId() + " desc: " + item.getDecs() + lineSeparator);


        assertThat(
                new String(out.toByteArray()),
                is((menu1.toString() + menu.toString() + menu1.toString())
                ));

    }

    /**
     * Тест, проверяющий вывод в консоль меню и пункт меню нахождение всех заявок.
     */
    @Test
    public void whenFindAllItem() {
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        StringBuilder menu = new StringBuilder();
        menu.append("------------ Показать все заявки ------------" + lineSeparator);
        for (Item item : tracker.findAll()) {
            menu.append(String.format("------------ name: %s------------ desc: %s", item.getName(), item.getDecs()));
        }
        assertThat(
                new String(out.toByteArray()),
                is((menu1.toString() + menu.toString() + lineSeparator + menu1.toString())
                ));

    }
}