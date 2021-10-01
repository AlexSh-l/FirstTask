package service;

public class NegativeValueInverter {

    public int[] invertNegativeValues(int[] array){
        for(int i = 0; i<array.length; i++){
            if(array[i]<0){
                array[i]*=-1;
            }
        }
        return array;
    }

}
