package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * 6.8. Удаление дубликатов в массиве.[#122494].
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expect));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }

    @Test
    public void whenArrayAllDuplicateThenDropIt() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"1", "1", "2", "2", "3", "3"};
        String[] result = arrayDuplicate.remove(input);
        String[] expect = {"1", "2", "3"};
        assertThat(result, arrayContainingInAnyOrder(expect));
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }

}