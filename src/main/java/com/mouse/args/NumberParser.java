package com.mouse.args;

public class NumberParser implements Parser {
    private final Parser stringParser;

    NumberParser() {
        stringParser = new StringParser();
    }

    @Override
    public Integer parse(String param) {
        String value = (String) stringParser.parse(param);
        try {
            return Integer.valueOf(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("param must be int");
        }
    }

    @Override
    public Object defaultParam() {
        return null;
    }
}
