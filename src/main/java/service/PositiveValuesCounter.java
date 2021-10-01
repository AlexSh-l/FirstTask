package service;

public class PositiveValuesCounter {

    public int countPositives(int[] array){
        int positivesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]>0){
                positivesCounter++;
            }
        }
        return positivesCounter;
    }

}
