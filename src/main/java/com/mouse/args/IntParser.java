package com.mouse.args;

public class IntParser implements Parser {

    @Override
    public Integer parse(String param) {
        try {
            return Integer.valueOf(param);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("param must be int");
        }
    }

    @Override
    public Integer defaultParam() {
        return 0;
    }
}
