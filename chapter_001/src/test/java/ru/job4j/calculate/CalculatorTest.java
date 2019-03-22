package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     * Test add
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test Sub
     */
    @Test
    public void whenSub25On5Then20() {
        Calculator calc = new Calculator();
        double result = calc.subtract(25, 5);
        double expected = 20;
        assertThat(result, is(expected));
    }

    /**
     * Test Div
     */
    @Test
    public void whenDiv25On5Then5() {
        Calculator calc = new Calculator();
        double result = calc.div(25, 5);
        double expected = 5;
        assertThat(result, is(expected));
    }

    /**
     * Test Multiple
     */
    @Test
    public void whenMultiple1On1Then1() {
        Calculator calc = new Calculator();
        double result = calc.multiple(1, 1);
        double expected = 1;
        assertThat(result, is(expected));
    }
}
