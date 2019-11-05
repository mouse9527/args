package com.mouse.args;

class Parser {
    static final Parser INT = new Parser("int");
    static final Parser STRING = new Parser("string");
    static final Parser BOOLEAN = new Parser("boolean");
    private final String type;

    Parser(String type) {
        this.type = type;
    }

    boolean isInt() {
        return type.equals("int");
    }

    boolean isaBoolean() {
        return type.equals("boolean");
    }

    boolean isString() {
        return type.equals("string");
    }

    Object parse(Param param) {
        if (isString()) return param.value();
        if (isaBoolean()) return param.hasFlag();
        if (isInt()) return Integer.valueOf(param.value());
        throw new IllegalStateException("Unsupported type");
    }
}
