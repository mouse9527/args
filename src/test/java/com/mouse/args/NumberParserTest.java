package com.mouse.args;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberParserTest {
    public @Rule ExpectedException exception = ExpectedException.none();
    private Parser parser;

    @Before
    public void setUp() {
        parser = new NumberParser();
    }

    @Test
    public void should_parse_int() {
        assertThat(parser.parse("1"), is(1));
    }

    @Test
    public void should_parse_field_with_non_number() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("param must be int");

        parser.parse("1a");
    }
}