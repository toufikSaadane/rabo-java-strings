package com.toufik.workingwithstrings.stringBasics;

import org.junit.Test;

public class JavaMultiLineString {
    private static String newLine= System.getProperty("line.separator");
    private static String NAME = "MEEEEEEEEEEEE";

    @Test
    public void separatedLinesStrings(){
        System.out.println(textBlocks());
        System.out.println("==============");
        System.out.println(stringConcatenation());
        System.out.println("==============");
        System.out.println(stringJoin());
        System.out.println("==============");
        System.out.println(stringBuilder());
        System.out.println("==============");
    }
    public static String textBlocks() {
        return """
        Get busy living
        or
        get busy dying.
        --Stephen King
        """;
    }
    public static String stringConcatenation() {
        return "Get busy living"
                .concat(newLine)
                .concat(NAME)
                .concat(newLine)
                .concat("or")
                .concat(newLine)
                .concat("get busy dying.")
                .concat(newLine)
                .concat("--Stephen King");
    }
    public static String stringJoin() {
        return String.join(newLine,
                "Get busy living",
                "or",
                "get busy dying.",
                "--Stephen King");
    }

    public static String stringBuilder() {
        return new StringBuilder()
                .append("Get busy living")
                .append(newLine)
                .append("or")
                .append(newLine)
                .append("get busy dying.")
                .append(newLine)
                .append("--Stephen King")
                .toString();
    }

}
