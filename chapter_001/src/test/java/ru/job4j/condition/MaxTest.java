package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    /**
     * Test whenMax1To2Then2.
     */
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }
    /**
     * Test whenMax1To10Then10.
     */
    @Test
    public void whenMax1To10Then10() {
        Max max = new Max();
        int result = max.max(2, 10);
        assertThat(result, is(10));
    }
    /**
     * Test whenMax10To10Then10.
     */
    @Test
    public void whenMax10To10Then10() {
        Max max = new Max();
        int result = max.max(10, 10);
        assertThat(result, is(10));
    }
}