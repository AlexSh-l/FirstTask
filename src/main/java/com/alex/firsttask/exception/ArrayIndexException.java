package com.alex.firsttask.exception;

public class ArrayIndexException extends Exception {

    public ArrayIndexException(String message){
        super(message);
    }

    public ArrayIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIndexException(Throwable cause) {
        super(cause);
    }

    protected ArrayIndexException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
