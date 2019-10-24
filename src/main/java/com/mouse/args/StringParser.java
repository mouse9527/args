package com.mouse.args;

public class StringParser implements Parser {
    @Override
    public Object parse(Object param) {
        return String.valueOf(param);
    }
}
