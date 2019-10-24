package com.mouse.args;

public class BooleanParser implements Parser {
    private final Parser stringParser;

    BooleanParser() {
        stringParser = new StringParser();
    }

    @Override
    public Object parse(Object param) {
        String value = (String) stringParser.parse(param);
        return Boolean.valueOf(value);
    }
}
