package com.mouse.args;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParamTest {
    
    @Test
    public void should_create_from_param_string() {
        Param param = new Param("-p 8080");
        assertEquals(new Param("p", "8080"), param);
    }
}
