package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test FindLoop. Тест проверяет работоспособность нахождения элемента массива.
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    /**
     * Тест, когда искомое число есть в массиве.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Тест, когда искомого числа нету в массиве.
     */
    @Test
    public void whenArrayDontHave5InArray() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{6, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}