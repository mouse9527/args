package com.mouse.args;

import java.util.Objects;

class Param {
    private final String flag;
    private final String value;

    Param(String param) {
        this.flag = "";
        this.value = "";
    }

    Param(String flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Param param = (Param) o;
        return Objects.equals(flag, param.flag) &&
                Objects.equals(value, param.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, value);
    }
}
