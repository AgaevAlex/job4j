package ru.job4j.tracker;

import java.util.*;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Переменная
     */
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public void add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
    }

    /**
     * Метод, заменяющий ячейку в массиве this.items.
     *
     * @param id   id ячейки в массиве, которую нужно заменить.
     * @param item объект на который нужно заменить
     * @return true если успешно, иначе false.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int count = 0; count < this.items.size(); count++) {
            if (this.items != null && this.items.get(count).getId().equals(id)) {
                this.items.set(count, item);
                this.items.get(count).setId(id);
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * Метод, удаляющий ячейку в массиве и смещающий все элементы после него на 1 ячейку влево.
     *
     * @param id массива, который нужно удалить.
     * @return true если успешно, иначе false.
     */
    public boolean delete(String id) {
        boolean result = false;

        for (int count = 0; count < this.items.size(); count++) {
            if (this.items != null && this.items.get(count).getId().equals(id)) {
                items.remove(count);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @return возвращает копию массива this.items без null элементов;
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     *
     * @param id с которым нужно сравнить.
     * @return item если  id равны, null если не найдено совпадений.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }

        }
        return result;
    }

    /**
     * Метод, проверяющий все элементы массива this.items, сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его
     *
     * @param key то с чем нужно сравнить name .
     * @return исходный масив.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>(items.size());
        for (int count = 0; count < this.items.size(); count++) {
            if (items.get(count).getName().equals(key)) {
                result.add(items.get(count));
            }
        }
        return result;
    }
}