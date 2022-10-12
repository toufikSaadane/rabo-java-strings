package com.toufik.workingwithstrings.stringAPI;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class ConcatStrings {
    @Test
    public void whenCallConcat_thenCorrect() {
        log.info("Logging {}", "concat");
        assertEquals("elephant", "elep".concat("hant"));
    }
}
