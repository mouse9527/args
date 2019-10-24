package com.mouse.args;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringParserTest {

    @Test
    public void should_parse_string() {
        Parser parser = new StringParser();
        assertThat(parser.parse("abc"), is("abc"));
    }
}