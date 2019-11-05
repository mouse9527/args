package com.mouse.args;

class Parser {
    Object parse(String value, String type) {
        if (type.equals("string")) return value;
        return Integer.valueOf(value);
    }

    Object parse(Param param, String type) {
        if (type.equals("string")) return param.value();
        if (type.equals("boolean")) return param.hasFlag();
        return Integer.valueOf(param.value());
    }

}
