package com.toufik.workingwithstrings.stringAPI;

import org.junit.Test;

import java.util.IllegalFormatException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;

public class StringFormat {

    @Test(expected = IllegalFormatException.class)
    public void whenInvalidFormatSyntax_thenIllegalFormatExceptionThrown() {
        String value = "Baeldung";
        String formatted = String.format("Welcome to %x!", value);
        assertThat("123",isA(String.class));
        assertThat(formatted, isA(String.class));
        assertEquals("Welcome to Baeldung!", formatted);
        assertThat("Welcome to Baeldung!", is(formatted));

    }
}
