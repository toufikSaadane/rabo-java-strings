package com.toufik.workingwithstrings.checkStringEmpty;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckingEmptyOrBlank {

    @Test
    public void emptyOrBlankCheck(){
        assertEquals(true, isEmptyString(""));
        assertEquals(false, isEmptyString("Ilias"));
        System.out.println("isEmptyStringWithJava5");
        assertEquals(true, isEmptyStringWithJava5(""));
        assertEquals(false, isEmptyStringWithJava5("Ilias"));
        System.out.println("isBlankString");
        assertEquals(true, isEmptyStringWithJava5(""));
        assertEquals(false, isEmptyStringWithJava5("Ilias"));
        System.out.println("isBlankStringUsingBlank");
        assertEquals(true, isEmptyStringWithJava5(""));
        assertEquals(false, isEmptyStringWithJava5("Ilias"));

    }
    private static boolean isEmptyString(String string) {
        return string == null || string.isEmpty();
    }
    boolean isEmptyStringWithJava5(String string) {
        return string == null || string.length() == 0;
    }
    boolean isBlankString(String string) {
        return string == null || string.trim().isEmpty();
    }
    boolean isBlankStringUsingBlank(String string) {
        return string == null || string.trim().isBlank();
    }
}
