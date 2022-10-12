package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodePointAt {

    @Test
    public void whenCallCodePointAt_thenDecimalUnicodeReturned() {
        assertEquals(97, "abcd".codePointAt(0));
    }


}
