package com.mouse.args;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void should_parser_for_int_type() {
        assertEquals(new Parser().parse("1", "int"), 1);
    }

    @Test
    public void should_parser_for_string_type() {
        assertEquals(new Parser().parse("abc", "string"), "abc");
    }

    @Test
    public void should_parser_for_boolean_type() {
        assertEquals(new Parser().parse("", "boolean"), true);
    }
}
