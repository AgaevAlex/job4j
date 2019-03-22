package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * Test Point.
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    /**
     * Test whenZeroAndTenThenTen.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 10, 10, 10);
        assertThat(result, is(10D));
    }
}