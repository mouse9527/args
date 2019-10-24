package com.mouse.args;

public interface Parser {
    Object parse(String param);

    Object defaultParam();
}
