package com.examples;

import java.util.Arrays;
import java.util.Optional;

public enum EnumExample
{
    A("text1"),
    B("text2"),
    C("text3"),
    D("text4");

    private String text;

    EnumExample(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Optional<EnumExample> fromText(String text) {
        return Arrays.stream(values())
          .filter(bl -> bl.text.equalsIgnoreCase(text))
          .findFirst();
    }
}