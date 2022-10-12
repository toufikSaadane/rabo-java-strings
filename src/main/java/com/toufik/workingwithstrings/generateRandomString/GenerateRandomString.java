package com.toufik.workingwithstrings.generateRandomString;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class GenerateRandomString {
    @Test
    public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        System.out.println(generatedString);
    }
    @Test
    public void whenCreateStringUsingByteArray_thenCorrect() {
        byte[] array = new byte[] { 97, 98, 99, 100 };
        String s = new String(array);
        System.out.println(s);
        assertEquals("abcd", s);
    }
}
