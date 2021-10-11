package com.alex.firsttask.sort;

import com.alex.firsttask.entity.NumbersArray;

public interface IArraySorter {

    int[] bubbleSort(NumbersArray numbersArray);

    int[] selectionSort(NumbersArray numbersArray);

    int[] insertionSort(NumbersArray numbersArray);

    int[] streamSorter(NumbersArray numbersArray);

}
