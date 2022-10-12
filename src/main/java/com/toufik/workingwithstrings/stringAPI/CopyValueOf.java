package com.toufik.workingwithstrings.stringAPI;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class CopyValueOf {
    @Test
    public void whenCallCopyValueOf_thenStringConstructed() {

        char[] array = new char[]{'a', 'b', 'c', 'd'};
        log.info("the value of the array is : {}", String.copyValueOf(array));
        assertEquals("abcd", String.copyValueOf(array));
    }
}
