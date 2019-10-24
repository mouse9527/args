package com.mouse.args;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BooleanParserTest {
    public @Rule ExpectedException exception = ExpectedException.none();

    @Test
    public void should_parse_boolean_correctly() {
        Parser parser = new BooleanParser();

        assertThat(parser.parse("true"), is(true));
    }

    @Test
    public void should_parse_failed_with_non_boolean_param() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("params must be boolean");

        Parser parser = new BooleanParser();
        parser.parse("aaa");
    }
}