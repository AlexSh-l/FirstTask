package service;

public class MaximumValueExtractor {

    public int getMaximumValue(int[] array){
        int maximumValue = array[0];
        for(int i=1; i < array.length; i++){
            if(maximumValue < array[i]){
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }

}
