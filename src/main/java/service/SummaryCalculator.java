package service;

public class SummaryCalculator {

    public int getSummary(int[] array){
        int summary = 0;
        for(int i = 0; i < array.length; i++){
            summary+=array[i];
        }
        return summary;
    }

}
