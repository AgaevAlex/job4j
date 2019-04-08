package ru.job4j.tracker;

import java.lang.reflect.Array;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

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
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            } else if (SHOW.equals(answer)) {
                this.showAllItems();
                break;
            } else if (EDIT.equals(answer)) {
                this.editItem();
                break;

            } else if (DELETE.equals(answer)) {
                this.deleteItem();
                break;
            } else if (FINDID.equals(answer)) {
                this.findItemById();
                break;
            } else if (FINDNAME.equals(answer)) {
                this.findItemByName();
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, 1234L);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод, удаляющий заявку по id
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки ------------");
        System.out.println("------------ Введите id заявки ------------");
        String id = this.input.ask("Введите id заявки");
        if (this.tracker.delete(id) == true) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка не найдена");
        }
    }

    /**
     * Меню
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select: ");
    }

    /**
     * Метод показывает все созданные заявки.
     */
    private void showAllItems() {
        System.out.println("------------ Показать все заявки ------------");
        for (int count = 0; count < this.tracker.findAll().length; count++) {
            System.out.println("------------ Имя: " + this.tracker.findAll()[count].getName() + " Desc: " + this.tracker.findAll()[count].getDecs() + " ------------");
        }
    }

    /**
     * Метод, редактирующий заявку.
     */
    private void editItem() {
        System.out.println("------------ Изменение заявки --------------");
        String id = this.input.ask("Введите id заявки");
        String name = this.input.ask("Введите имя заявки");
        String desc = this.input.ask("Введите desc заявки");
        Item item = new Item(name, desc, 1245L);

        if (tracker.replace(id, item) == true) {
            System.out.println("Заявка изменена: name: " + tracker.findById(id).getName() + " id: " + tracker.findById(id).getId() + " desc" + tracker.findById(id).getDecs());
        } else {
            System.out.println("Заявка не найдена");
        }

    }

    /**
     * Метод находящий заявку по id
     */
    private void findItemById() {
        System.out.println("------------ Нахождение заявки по Id --------------");
        String id = this.input.ask("Введите id заявки :");
        this.tracker.findById(id);
        if (this.tracker.findById(id) != null) {
            System.out.println("Заявка с данным id найдена.Name: " + tracker.findById(id).getName() + " desc: " + tracker.findById(id).getDecs());
        } else {
            System.out.println("Заявка с данным id не найдена ");
        }
    }

    /**
     * Метод находящий заявку по имени.
     */
    private void findItemByName() {
        System.out.println("------------ Нахождение заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        //пока что без проверки.
        Item[] items = tracker.findByName(name);
        for (int count = 0; count < items.length; count++) {
            System.out.println("Заявка с данным именем найдена: name: " + tracker.findByName(name)[count].getName() + " id" + tracker.findByName(name)[count].getId() + " desc: " + tracker.findByName(name)[count].getDecs());
        }
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
