package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSortTest {

    @Test
    public void sort() {
        TestSort testSort = new TestSort();
        int[] input = new int[]{1, 3, 4, 5, 6};
        int[] input2 = new int[]{2, 4};
        int[] result = testSort.sort(input,input2);
        int[] expect = new int[]{1, 2, 3, 4, 4, 5, 6};
        assertThat(result, Matchers.is(expect));

    }
}