package com.alex.firsttask.validators;

import com.alex.firsttask.constants.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private static final Pattern pattern = Pattern.compile(Constants.NUMBERS_EXPRESSION);

    public Matcher matcher;

    public boolean indexCheck(int[] array, int index){
        return (index >= 0) && (index <= array.length);
    }

    public boolean validateArray(String line){
        matcher = pattern.matcher(line);
        return matcher.find();
    }

}
