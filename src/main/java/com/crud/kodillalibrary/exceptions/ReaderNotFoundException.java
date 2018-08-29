package com.crud.kodillalibrary.exceptions;

public class ReaderNotFoundException extends Exception {

    public static final String READER_NOT_FOUND_EXCEPTION = "Reader not found exception";

    public ReaderNotFoundException(String message){
        super(message);
    }
}
