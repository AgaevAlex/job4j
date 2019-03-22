package ru.job4j.converter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Converter.
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ConverterTest {
    /**
     * Test rub to dollar.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test rub to euro.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test dollar to rub.
     */
    @Test
    public void when70DollarToRubleThen4200() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(70);
        assertThat(result, is(4200));
    }

    /**
     * Test euro to rub.
     */
    @Test
    public void when70EuroToRubleThen4900() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(70);
        assertThat(result, is(4900));
    }
}
