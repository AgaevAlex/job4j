package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MultiMaxTest {
    /**
     * Тест, когда 2 число максимальное.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Тест, когда 1 число максимальное.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    /**
     * Тест, когда 3 число максимальное.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }
}