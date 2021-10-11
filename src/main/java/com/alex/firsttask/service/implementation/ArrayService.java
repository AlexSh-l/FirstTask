package com.alex.firsttask.service.implementation;

import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.service.IArrayService;

public class ArrayService implements IArrayService {

    @Override
    public float countAverageValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return (float)summary/array.length;
    }

    @Override
    public int findMaximumValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int maximumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(maximumValue < array[i]){
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }

    @Override
    public int findMinimumValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int minimumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(minimumValue > array[i]){
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }

    @Override
    public int countNegatives(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int negativesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]<0){
                negativesCounter++;
            }
        }
        return negativesCounter;
    }

    @Override
    public int countPositives(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int positivesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>0){
                positivesCounter++;
            }
        }
        return positivesCounter;
    }

    @Override
    public int countSummary(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return summary;
    }

}
