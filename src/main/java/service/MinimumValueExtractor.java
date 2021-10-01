package service;

public class MinimumValueExtractor {

    public int getMinimumValue(int[] array){
        int minimumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(minimumValue > array[i]){
                minimumValue = array[i];
            }
        }
        return minimumValue;
    }

}
