package com.alex.firsttask.entity;

import com.alex.firsttask.exception.ArrayIndexException;
import java.util.Arrays;

public class NumbersArray {

    private int[] array;

    public void setArray(int length){
        this.array = new int[length];
    }

    public void setArray(int... values){
        this.array = new int[values.length];
        int i = 0;
        for(int value:values){
            this.array[i] = value;
            i++;
        }
    }

    public int getLength(){
        return array.length;
    }

    public int[] getArray() {
        return array;
    }

    public int getElementById(int index) throws ArrayIndexException {
        if(indexCheck(index)) {
            return array[index];
        }
        else {
            throw new ArrayIndexException("Index out of bounds");
        }
    }

    public boolean indexCheck(int index){
        return (index >= 0) && (index <= array.length);
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
