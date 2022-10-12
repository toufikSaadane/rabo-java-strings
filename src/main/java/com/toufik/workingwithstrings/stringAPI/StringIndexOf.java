package com.toufik.workingwithstrings.stringAPI;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class StringIndexOf {
    @Test
    public void whenCallIndexOf_thenCorrect() {
        String str = "foo";
        log.info("index of o is : {}", str.indexOf("o"));
        assertEquals(1, str.indexOf("o"));
        assertEquals(-1, str.indexOf("s"));
    }
}
