package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Внешний класс, добавляющий итем
 */
class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, 1234L);
        tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
}

/**
 * Главный класс
 */
public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI ui) {
        this.actions.add(new AddItem(0, "Add program"));
        this.actions.add(new ShowItems(1, "Show all items"));
        this.actions.add(new EditItems(2, "Edit item"));
        this.actions.add(new DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program", ui));
    }


    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Внутренний класс, показывающий все итемы
     */
    private static class ShowItems extends BaseAction {
        public ShowItems(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Показать все заявки ------------");
            Item[] items = tracker.findAll();
            StringBuilder pic = new StringBuilder();
            for (int count = 0; count < items.length; count++) {
                pic.append("------------ name: " + items[count].getName());
                pic.append("------------ desc: " + items[count].getDecs());

            }
            System.out.println((pic.toString()));

        }
    }

    /**
     * Внутренний класс, изменяющий итем.
     */
    private static class EditItems extends BaseAction {

        public EditItems(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Изменение заявки --------------");
            String id = input.ask("Введите id заявки");
            Item item = new Item(input.ask("Введите имя заявки"), input.ask("Введите desc заявки"), 1245L);

            if (tracker.replace(id, item)) {
                System.out.println("Заявка изменена: name: " + item.getName() + " id: " + item.getId() + " desc" + item.getDecs());
            } else {
                System.out.println("Заявка не найдена");
            }
        }
    }

    private static class DeleteItem extends BaseAction {

        public DeleteItem(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки ------------");
            System.out.println("------------ Введите id заявки ------------");
            String id = input.ask("Введите id заявки");
            if (tracker.delete(id)) {
                System.out.println("Заявка удалена");
            } else {
                System.out.println("Заявка не найдена");
            }
        }
    }

    private static class FindItemById extends BaseAction {

        public FindItemById(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Нахождение заявки по Id --------------");
            Item item = tracker.findById(input.ask("Введите id заявки :"));
            if (item != null) {
                System.out.println("Заявка с данным id найдена.Name: " + item.getName() + " desc: " + item.getDecs());
            } else {
                System.out.println("Заявка с данным id не найдена ");
            }
        }
    }

    private static class FindItemByName extends BaseAction {


        public FindItemByName(int key, String name) {
            super(key, name);
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Нахождение заявки по имени --------------");
            Item[] items = tracker.findByName(input.ask("Введите имя заявки :"));
            for (int count = 0; count < items.length; count++) {
                System.out.println("Заявка с данным именем найдена: name: " + items[count].getName() + " id " + items[count].getId() + " desc: " + items[count].getDecs());
            }
        }
    }

    private static class ExitProgram extends BaseAction {
        private final StartUI ui;

        public ExitProgram(int key, String name, StartUI ui) {
            super(key, name);
            this.ui = ui;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            this.ui.stop();
        }

    }

}
