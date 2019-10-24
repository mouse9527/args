package com.mouse.args;

public class BooleanParser implements Parser {
    private final Parser stringParser;

    BooleanParser() {
        stringParser = new StringParser();
    }

    @Override
    public Object parse(String param) {
        String value = (String) stringParser.parse(param);
        try {
            return Boolean.valueOf(value);
        } catch (Exception e) {
            throw new IllegalArgumentException("param must be boolean");
        }
    }

    @Override
    public Object defaultParam() {
        return null;
    }
}
