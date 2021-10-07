package com.alex.firsttask.parsers;

import com.alex.firsttask.exceptions.DataParserException;
import com.alex.firsttask.validators.Validation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class DataParser {

    private static final Logger logger = LogManager.getLogger();

    public int[] parseData(List<String> fileText) throws DataParserException {
        ArrayList<Integer> list = new ArrayList<>();
        int length = 0;
        try {
            Validation validation = new Validation();
            for (String line : fileText) {
                if (validation.validateArray(line)) {
                    String stringNumber = validation.matcher.group();
                    String[] numbersString = stringNumber.split(" ");
                    for(String number:numbersString){
                        Integer integerNumber = Integer.parseInt(number);
                        list.add(integerNumber);
                        length++;
                    }
                }
            }
        }
        catch (NumberFormatException | NullPointerException e){
            logger.error(e.getMessage());
            throw new DataParserException("Unable to parse data");
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
