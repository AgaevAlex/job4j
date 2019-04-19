package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"invalid", "1"})
        );
        input.ask("Enter", Collections.singletonList(1));
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please enter validate data again. %n")
                )
        );
    }

    @Test
    public void whenKeyNotInRange() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[]{"55", "1"})
        );
        input.ask("Enter", Collections.singletonList(1));
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Please select key from menu. %n")
                )
        );
    }
}