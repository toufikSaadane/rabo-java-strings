package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InternMethod {

    @Test
    public void whenIntern_thenCorrect() {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("foo");
        String s4 = s1.intern();
        String s5 = s2.intern();
        assertFalse(s1 == s2); // van hier begint het probleem
        assertTrue(s1.equals(s2));
        assertFalse(s3 == s4);
        assertTrue(s1 == s5);
    }
}
