package entity;

import java.util.Arrays;

public class NumbersArray {

    private int[] array;

    public int[] numbersArrayNewInstance(int length){
        array = new int[length];
        return array;
    }

    public int[] numbersArrayNewInstance(int... values){
        array = new int[values.length];
        int i = 0;
        for(int dimension:values){
            array[i] = dimension;
            i++;
        }
        return array;
    }

    public int getLength(){
        return array.length;
    }

    public int getElementById(int index){
        return array[index];
    }

    public String arrayToString(){
        return Arrays.toString(array);
    }

}
