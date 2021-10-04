package com.alex.exceptions;

public class ArrayIndexException extends Exception {

    private final int index;

    public ArrayIndexException(String message, int i){
        super(message);
        index = i;
    }

    public int getIndex(){
        return index;
    }

}
