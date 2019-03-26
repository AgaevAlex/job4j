package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * 6.3. Массив заполнен true или false[#122490].
 *
 * @author Alex Agaev (agaevalex97@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CheckTest {
    /**
     * Тест, когда все элементы массива true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Тест, когда в массиве имеется элемент false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}