package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAPI {
    @Test
    public void whenCallCodePointCount_thenCorrect() {
        assertEquals(2, "ab".codePointCount(0, 2));
    }
}
