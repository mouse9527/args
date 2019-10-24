package com.mouse.args;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntParserTest {
    public @Rule ExpectedException exception = ExpectedException.none();

    @Test
    public void should_parse_int() {
        assertThat(new IntParser().parse("1"), is(1));
    }

    @Test
    public void should_return_default_param_correctly() {
        assertThat(new IntParser().defaultParam(), is(0));
    }

    @Test
    public void should_parse_field_with_non_number() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("param must be int");

        new IntParser().parse("1a");
    }
}