package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * Как вариант можно было изменить тип age на Integer
     * и записать this.age.compareTo(o.age);
     * либо использовать Comparator.comparing
     */
    @Override
    public int compareTo(User o) {
        if (this.name.equals(o.name)) {
            if (this.age > o.age) {
                return -1;
            } else if (this.age < o.age) {
                return 1;
            } else {
                return 0;
            }
        }
        return  this.name.compareTo(o.name);


    }
}