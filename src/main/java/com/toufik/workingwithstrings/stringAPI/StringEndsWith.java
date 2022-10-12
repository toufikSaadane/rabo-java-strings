package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringEndsWith {
    @Test
    public void whenCallEndsWith_thenCorrect() {
        String s1 = "test";
        assertTrue(s1.endsWith("t"));
    }
}
