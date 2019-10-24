package com.mouse.args;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BooleanParserTest {

    @Test
    public void should_parse_boolean_correctly() {
        Parser parser = new BooleanParser();

        assertThat(parser.parse("true"), is(true));
    }
}