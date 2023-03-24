package com.company.exceptions;

public class NameFormatException extends Exception {

    private static final long serialVersionID = 1L;

    public NameFormatException(String errorMessage) {
        super(errorMessage);
    }
}
