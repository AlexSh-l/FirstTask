package service;

public class NegativeValuesCounter {

    public int countNegatives(int[] array){
        int negativesCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]<0){
                negativesCounter++;
            }
        }
        return negativesCounter;
    }

}
