package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(new Person("Alex", "Agaev", "88003353535", "Orsk"));
        phoneDictionary.add(new Person("Alex1", "Agaev1", "880033535352", "Ors2k"));
        ArrayList<Person> findName = new ArrayList<>(phoneDictionary.find("Agaev"));
        assertThat(findName.get(0).getSurname(), is("Agaev"));


    }

}