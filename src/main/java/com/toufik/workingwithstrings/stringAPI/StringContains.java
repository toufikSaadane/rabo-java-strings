package com.toufik.workingwithstrings.stringAPI;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Slf4j
public class StringContains {
    @Test
    public void whenCallContains_thenCorrect() {
        log.info("logging {}", "Contains");
        String s = "abcd";
        assertTrue(s.contains("abc"));
        assertFalse(s.contains("cde"));
    }
}
