package com.alex.firsttask.sort.implementation;

import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.sort.IArraySorter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySorter implements IArraySorter {

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    @Override
    public int[] bubbleSort(NumbersArray numbersArray){
        int[]array = numbersArray.getArray();
        int[] resultingArray = Arrays.copyOf(array, array.length);
        boolean isIterable = true;
        while (isIterable) {
            isIterable = false;
            for (int i = 1; i < resultingArray.length; i++) {
                if (resultingArray[i] < resultingArray[i - 1]) {
                    swap(resultingArray, i, i-1);
                    isIterable = true;
                }
            }
        }
        return resultingArray;
    }

    @Override
    public int[] selectionSort(NumbersArray numbersArray){
        int[]array = numbersArray.getArray();
        int[] resultingArray = Arrays.copyOf(array, array.length);
        for (int left = 0; left < resultingArray.length; left++) {
            int minIndex = left;
            for (int i = left; i < resultingArray.length; i++) {
                if (resultingArray[i] < resultingArray[minIndex]) {
                    minIndex = i;
                }
            }
            swap(resultingArray, left, minIndex);
        }
        return resultingArray;
    }

    @Override
    public int[] insertionSort(NumbersArray numbersArray){
        int[]array = numbersArray.getArray();
        int[] resultingArray = Arrays.copyOf(array, array.length);
        for (int i = 1; i < resultingArray.length; i++) {
            int current = resultingArray[i];
            int j = i - 1;
            while(j >= 0 && current < resultingArray[j]) {
                resultingArray[j+1] = resultingArray[j];
                j--;
            }
            resultingArray[j+1] = current;
        }
        return resultingArray;
    }

    @Override
    public int[] streamSorter(NumbersArray numbersArray){
        int[]array = numbersArray.getArray();
        int[] sortedArray = IntStream.of(array)
                .sorted().toArray();
        return sortedArray;
    }

}
