package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях
     *
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person s1 : person) {
            if (s1.getAdress().contains(key) || s1.getName().contains(key) || s1.getPhone().contains(key) || s1.getSurname().contains(key)) {
                result.add(s1);
            }
        }

        return result;
    }
}
