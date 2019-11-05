package com.mouse.args;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void should_parser_for_int_type() {
        assertEquals(new Parser().parse(new Param("p 1"), "int"), 1);
    }

    @Test
    public void should_parser_for_string_type() {
        assertEquals(new Parser().parse(new Param("d abc"), "string"), "abc");
    }

    @Test
    public void should_parser_for_boolean_type() {
        assertEquals(new Parser().parse(new Param("l"), "boolean"), true);
    }

    @Test
    public void should_parser_for_boolean_type_with_empty_param() {
        assertEquals(new Parser().parse(new Param(), "boolean"), false);
    }
}
