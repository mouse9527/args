package com.mouse.args;

public class StringParser implements Parser {
    @Override
    public String parse(String param) {
        return param;
    }

    @Override
    public String defaultParam() {
        return "";
    }
}
