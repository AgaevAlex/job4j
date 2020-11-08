package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Petr1", "Arsentev", "5348724", "Bryansk1"));
        phones.add(new Person("Petr2", "Arsentev", "53487245", "Bryansk2"));
        phones.add(new Person("Petr3", "Arsentev", "53487246", "Bryansk3"));

        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(3).getSurname(), is("Arsentev"));

    }
}
