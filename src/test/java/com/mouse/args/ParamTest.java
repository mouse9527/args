package com.mouse.args;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ParamTest {
    public @Rule ExpectedException exception = ExpectedException.none();

    @Test
    public void should_create_empty_param() {
        Param param = new Param();
        assertFalse(param.hasFlag());
    }

    @Test
    public void should_reject_create_with_empty_param() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("param must be not empty");

        new Param(" ");
    }

    @Test
    public void should_reject_access_flag_with_empty_param() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("Parameter has't flag");

        new Param().flag();
    }

    @Test
    public void should_split_flag_and_value() {
        Param param = new Param("p 8080");
        assertEquals("p", param.flag());
        assertEquals("8080", param.value());
    }

    @Test
    public void should_reject_when_param_not_legal() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Illegal parameter [-p 8080 8081]");

        new Param("p 8080 8081");
    }

    @Test
    public void should_split_single_flag() {
        Param param = new Param("l");
        assertEquals("l", param.flag());
    }

    @Test
    public void should_reject_access_value_with_single_flag() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("Parameter [-l] has't value");

        Param param = new Param("l");
        param.value();
    }

    @Test
    public void should_parser_for_int_type() {
        assertEquals(new Param("p 1").parse(Parser.INT), 1);
    }

    @Test
    public void should_parser_for_string_type() {
        assertEquals(new Param("d abc").parse(Parser.STRING), "abc");
    }

    @Test
    public void should_parser_for_boolean_type() {
        assertEquals(new Param("l").parse(Parser.BOOLEAN), true);
    }

    @Test
    public void should_parser_for_boolean_type_with_empty_param() {
        assertEquals(new Param().parse(Parser.BOOLEAN), false);
    }

    @Test
    public void should_reject_parser_with_other_type() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("Unsupported type");

        new Param("l").parse(new Parser("aaa"));
    }
}
