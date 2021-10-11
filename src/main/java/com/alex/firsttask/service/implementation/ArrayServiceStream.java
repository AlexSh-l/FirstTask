package com.alex.firsttask.service.implementation;

import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.service.IArrayService;
import java.util.stream.IntStream;

public class ArrayServiceStream implements IArrayService {

    @Override
    public float countAverageValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        double average = IntStream.of(array)
                .average().getAsDouble();
        return (float)average;
    }

    @Override
    public int findMaximumValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int maximum = IntStream.of(array)
                .max().getAsInt();
        return maximum;
    }

    @Override
    public int findMinimumValue(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int minimum = IntStream.of(array)
                .min().getAsInt();
        return minimum;
    }

    @Override
    public int countNegatives(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        long negatives = IntStream.of(array)
                .filter(n->n<0).count();
        return (int)negatives;
    }

    @Override
    public int countPositives(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        long positives = IntStream.of(array)
                .filter(n->n>0).count();
        return (int)positives;
    }

    @Override
    public int countSummary(NumbersArray numbersArray) {
        int[] array = numbersArray.getArray();
        int summary = IntStream.of(array)
                .sum();
        return summary;
    }

}
