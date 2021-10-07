package com.alex.firsttask;

import com.alex.firsttask.entities.NumbersArray;
import com.alex.firsttask.exceptions.ArrayIndexException;
import com.alex.firsttask.exceptions.DataParserException;
import com.alex.firsttask.exceptions.FileReaderException;
import com.alex.firsttask.filereaders.NumbersReader;
import com.alex.firsttask.parsers.DataParser;
import com.alex.firsttask.services.implementations.ArrayServices;
import com.alex.firsttask.sorts.ArraySorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        NumbersReader numbersReader = new NumbersReader();
        List<String> numbersRead = new ArrayList<>();
        try {
            numbersRead = numbersReader.readNumbers();
        } catch (FileReaderException e) {
            logger.error(e.getMessage());
        }
        DataParser dataParser = new DataParser();
        int[] numbersList = new int[0];
        try {
            numbersList = dataParser.parseData(numbersRead);
        } catch (DataParserException e) {
            logger.error(e.getMessage());
        }
        NumbersArray numbersArray = new NumbersArray();
        int[] array = numbersArray.numbersArrayNewInstance(numbersList);
        logger.info(numbersArray.toString());
        ArrayServices arrayServices = new ArrayServices();
        int minimumValue = arrayServices.findMinimumValue(array);
        logger.info(minimumValue);
        int maximumValue = arrayServices.findMaximumValue(array);
        logger.info(maximumValue);
        float averageValue = arrayServices.countAverageValue(array);
        logger.info(averageValue);
        int[] invertedArray = arrayServices.invertNegativeValues(array);
        logger.info(Arrays.toString(invertedArray));
        int summary = arrayServices.countSummary(array);
        logger.info(summary);
        int numberOfPositives = arrayServices.countPositives(array);
        logger.info(numberOfPositives);
        int numberOfNegatives = arrayServices.countNegatives(array);
        logger.info(numberOfNegatives);
        ArraySorter arraySorter = new ArraySorter();
        int[] bubbleArray = Arrays.copyOf(array,array.length);
        int[] selectionArray = Arrays.copyOf(array,array.length);
        int[] insertionArray = Arrays.copyOf(array,array.length);
        arraySorter.bubbleSort(bubbleArray);
        logger.info(Arrays.toString(bubbleArray));
        arraySorter.selectionSort(selectionArray);
        logger.info(Arrays.toString(selectionArray));
        arraySorter.insertionSort(insertionArray);
        logger.info(Arrays.toString(insertionArray));
        try {
            int ninthElement = numbersArray.getElementById(9);
            logger.info(ninthElement);
        }
        catch(ArrayIndexException e){
            logger.error(e.getMessage());
        }
        try {
            int twentiethElement = numbersArray.getElementById(20);
            logger.info(twentiethElement);
        }
        catch(ArrayIndexException e){
            logger.error(e.getMessage());
        }
    }

}
