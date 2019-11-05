package com.mouse.args;

import java.util.Objects;

class Param {
    private final String flag;
    private final String value;

    // FIXME: refactor it
    Param(String param) {
        String[] split = param.trim().split(" ");
        checkParam(param, split);
        if (split.length == 2) {
            this.flag = split[0];
            this.value = split[1];
        } else {
            this.flag = split[0];
            this.value = null;
        }
    }

    Param() {
        this.flag = null;
        this.value = null;
    }

    private void checkParam(String param, String[] split) {
        if (split.length > 2) {
            throw new IllegalArgumentException(String.format("Illegal parameter [-%s]", param));
        }
        if (split.length == 1 && split[0].equals("")) {
            throw new IllegalArgumentException("param must be not empty");
        }
    }

    String flag() {
        if (!hasFlag()) throw new IllegalStateException("Parameter has't flag");
        return flag;
    }

    String value() {
        requireValueNotNull();
        return value;
    }

    private void requireValueNotNull() {
        if (Objects.isNull(value)) throw new IllegalStateException(String.format("Parameter [-%s] has't value", flag));
    }

    boolean hasFlag() {
        return Objects.nonNull(flag);
    }
}
