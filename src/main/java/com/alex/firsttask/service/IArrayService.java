package com.alex.firsttask.service;

import com.alex.firsttask.entity.NumbersArray;

public interface IArrayService {

    float countAverageValue(NumbersArray array);

    int findMaximumValue(NumbersArray array);

    int findMinimumValue(NumbersArray array);

    default int[] invertNegativeValues(NumbersArray numbersArray){
        int[] array = numbersArray.getArray();
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

    int countNegatives(NumbersArray array);

    int countPositives(NumbersArray array);

    int countSummary(NumbersArray array);

}
