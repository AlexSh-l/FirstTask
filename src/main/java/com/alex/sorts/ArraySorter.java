package com.alex.sorts;

public class ArraySorter {

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public int[] bubbleSort(int[] array){
        boolean isIterable = true;
        while (isIterable) {
            isIterable = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    isIterable = true;
                }
            }
        }
        return array;
    }

    public int[] selectionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            swap(array, left, minIndex);
        }
        return array;
    }

    public int[] insertionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }

}
