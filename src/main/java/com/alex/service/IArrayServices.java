package com.alex.service;

public interface IArrayServices {

    float getAverageValue(int[] array);

    int getMaximumValue(int[] array);

    int getMinimumValue(int[] array);

    int[] invertNegativeValues(int[] array);

    int countNegatives(int[] array);

    int countPositives(int[] array);

    int getSummary(int[] array);

}
