package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Empty {
    @Test
    public void whenCallIsEmpty_thenCorrect() {
        String s1 = "";
        String name = "       toufik ";
        String myName = "toufik";
        assertTrue(myName.intern() == (myName));
        System.out.println(name);
        assertTrue(s1.isEmpty());
        assertTrue(s1.isBlank());
    }
}
