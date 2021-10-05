package com.alex.validator;

import com.alex.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private static final Logger logger = LogManager.getLogger();

    public boolean indexCheck(int[] array, int index){
        return (index >= 0) && (index <= array.length);
    }

    public int[] validateArray(List<String> fileText){
        ArrayList<Integer> list = new ArrayList<>();
        int length = 0;
        try {
            Pattern pattern = Pattern.compile(Constants.NUMBERS_EXPRESSION);
            Matcher matcher;
            for (String line : fileText) {
                matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String stringNumber = matcher.group();
                    String[] numbersString = stringNumber.split(" ");
                    for(String number:numbersString){
                        Integer integerNumber = Integer.parseInt(number);
                        list.add(integerNumber);
                        length++;
                    }
                }
            }
        }
        catch (NumberFormatException | NullPointerException numEx){
            logger.error(numEx.getMessage());
        }
        int[] resultingArray = new int[length];
        int i = 0;
        for(int item:list){
            resultingArray[i]=item;
            i++;
        }
        return resultingArray;
    }

}
