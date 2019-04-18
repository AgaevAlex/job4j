package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
//    /**
//     * Константа меню для добавления новой заявки.
//     */
//    private static final String ADD = "0";
//    private static final String SHOW = "1";
//    private static final String EDIT = "2";
//    private static final String DELETE = "3";
//    private static final String FINDID = "4";
//    private static final String FINDNAME = "5";
//    /**
//     * Константа для выхода из цикла.
//     */
//    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    private boolean working = true;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        List<Integer> ranges = new ArrayList<>();
        menu.fillActions(this);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            ranges.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("Select:", ranges));
        } while (this.working);
    }

    public void stop() {
        this.working = false;
    }
//    /**
//     * Метод реализует добавленяи новый заявки в хранилище.
//     */
//    private void createItem() {
//        System.out.println("------------ Добавление новой заявки --------------");
//        String name = this.input.ask("Введите имя заявки :");
//        String desc = this.input.ask("Введите описание заявки :");
//        Item item = new Item(name, desc, 1234L);
//        this.tracker.add(item);
//        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
//    }
//
//    /**
//     * Метод, удаляющий заявку по id
//     */
//    private void deleteItem() {
//        System.out.println("------------ Удаление заявки ------------");
//        System.out.println("------------ Введите id заявки ------------");
//        String id = this.input.ask("Введите id заявки");
//        if (this.tracker.delete(id)) {
//            System.out.println("Заявка удалена");
//        } else {
//            System.out.println("Заявка не найдена");
//        }
//    }
//
//    /**
//     * Меню
//     */
//    private void showMenu() {
//        System.out.println("Меню.");
//        System.out.println("0. Add new Item");
//        System.out.println("1. Show all items");
//        System.out.println("2. Edit item");
//        System.out.println("3. Delete item");
//        System.out.println("4. Find item by Id");
//        System.out.println("5. Find items by name");
//        System.out.println("6. Exit Program");
//        System.out.println("Select: ");
//    }
//
//    /**
//     * Метод показывает все созданные заявки.
//     */
//    private void showAllItems() {
//        System.out.println("------------ Показать все заявки ------------");
//        Item[] items = this.tracker.findAll();
//        StringBuilder pic = new StringBuilder();
//        for (int count = 0; count < items.length; count++) {
//            pic.append("------------ name: " + items[count].getName());
//            pic.append("------------ desc: " + items[count].getDecs());
//
//        }
//        System.out.println((pic.toString()));
//    }
//
//    /**
//     * Метод, редактирующий заявку.
//     */
//    private void editItem() {
//        System.out.println("------------ Изменение заявки --------------");
//        String id = this.input.ask("Введите id заявки");
//        Item item = new Item(this.input.ask("Введите имя заявки"), this.input.ask("Введите desc заявки"), 1245L);
//
//        if (tracker.replace(id, item)) {
//            System.out.println("Заявка изменена: name: " + item.getName() + " id: " + item.getId() + " desc" + item.getDecs());
//        } else {
//            System.out.println("Заявка не найдена");
//        }
//
//    }
//
//    /**
//     * Метод находящий заявку по id
//     */
//    private void findItemById() {
//        System.out.println("------------ Нахождение заявки по Id --------------");
//        Item item = this.tracker.findById(this.input.ask("Введите id заявки :"));
//        if (item != null) {
//            System.out.println("Заявка с данным id найдена.Name: " + item.getName() + " desc: " + item.getDecs());
//        } else {
//            System.out.println("Заявка с данным id не найдена ");
//        }
//    }
//
//    /**
//     * Метод находящий заявку по имени.
//     */
//    private void findItemByName() {
//        System.out.println("------------ Нахождение заявки по имени --------------");
//        Item[] items = tracker.findByName(this.input.ask("Введите имя заявки :"));
//        for (int count = 0; count < items.length; count++) {
//            System.out.println("Заявка с данным именем найдена: name: " + items[count].getName() + " id " + items[count].getId() + " desc: " + items[count].getDecs());
//        }
//    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }
}
