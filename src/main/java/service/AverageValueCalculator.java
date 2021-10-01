package service;

public class AverageValueCalculator {

    public float getAverageValue(int[] array){
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return (float)summary/array.length;
    }

}
