package com.alex.service.implementation;

import com.alex.service.IArrayServices;

public class ArrayServices implements IArrayServices {
    @Override
    public float getAverageValue(int[] array) {
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return (float)summary/array.length;
    }

    @Override
    public int getMaximumValue(int[] array) {
        int maximumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(maximumValue < array[i]){
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }

    @Override
    public int getMinimumValue(int[] array) {
        int minimumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(minimumValue > array[i]){
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }

    @Override
    public int[] invertNegativeValues(int[] array) {
        int[] invertedArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            if(array[i]<0){
                invertedArray[i] = array[i] * -1;
            }
            else {
                invertedArray[i] = array[i];
            }
        }
        return invertedArray;
    }

    @Override
    public int countNegatives(int[] array) {
        int negativesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]<0){
                negativesCounter++;
            }
        }
        return negativesCounter;
    }

    @Override
    public int countPositives(int[] array) {
        int positivesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>0){
                positivesCounter++;
            }
        }
        return positivesCounter;
    }

    @Override
    public int getSummary(int[] array) {
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return summary;
    }
}
