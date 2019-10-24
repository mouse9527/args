package com.mouse.args;

public class StringParser implements Parser {
    @Override
    public String parse(Object param) {
        return String.valueOf(param);
    }
}
