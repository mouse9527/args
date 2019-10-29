package com.mouse.args;

class Parser {
    Object parse(String value, String type) {
        if (type.equals("string")) return value;
        return Integer.valueOf(value);
    }
}
