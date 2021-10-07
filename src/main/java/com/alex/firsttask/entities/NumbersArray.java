package com.alex.firsttask.entities;

import com.alex.firsttask.exceptions.ArrayIndexException;
import com.alex.firsttask.validators.Validation;

import java.util.Arrays;

public class NumbersArray {

    private static final Validation validation = new Validation();

    private int[] array;

    public int[] numbersArrayNewInstance(int length){
        array = new int[length];
        return array;
    }

    public int[] numbersArrayNewInstance(int... values){
        array = new int[values.length];
        int i = 0;
        for(int value:values){
            array[i] = value;
            i++;
        }
        return array;
    }

    public int getLength(){
        return array.length;
    }

    public int getElementById(int index) throws ArrayIndexException {
        if(validation.indexCheck(array, index)) {
            return array[index];
        }
        else {
            throw new ArrayIndexException("Index out of bounds");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    } 

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof int[]) {
            if (array.length == ((int[]) obj).length) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != ((int[]) obj)[i]) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(array);
    }

}
