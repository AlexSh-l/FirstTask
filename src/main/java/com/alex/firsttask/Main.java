package com.alex.firsttask;

import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.exception.ArrayIndexException;
import com.alex.firsttask.exception.FileReaderException;
import com.alex.firsttask.filereader.implementation.CustomFileReader;
import com.alex.firsttask.parser.implementation.DataParser;
import com.alex.firsttask.service.implementation.ArrayService;
import com.alex.firsttask.sort.implementation.ArraySorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        CustomFileReader customFileReader = new CustomFileReader();
        List<String> numbersRead = new ArrayList<>();
        try {
            if(customFileReader.readFile().isPresent()) {
                numbersRead = customFileReader.readFile().get();
            }
        } catch (FileReaderException e) {
            logger.error(e.getMessage());
        }
        DataParser dataParser = new DataParser();
        int[] numbersList = dataParser.parseData(numbersRead);
        NumbersArray numbersArray = new NumbersArray();
        numbersArray.setArray(numbersList);
        logger.info(numbersArray.toString());
        ArrayService arrayService = new ArrayService();
        int minimumValue = arrayService.findMinimumValue(numbersArray);
        logger.info(minimumValue);
        int maximumValue = arrayService.findMaximumValue(numbersArray);
        logger.info(maximumValue);
        float averageValue = arrayService.countAverageValue(numbersArray);
        logger.info(averageValue);
        int[] invertedArray = arrayService.invertNegativeValues(numbersArray);
        logger.info(Arrays.toString(invertedArray));
        int summary = arrayService.countSummary(numbersArray);
        logger.info(summary);
        int numberOfPositives = arrayService.countPositives(numbersArray);
        logger.info(numberOfPositives);
        int numberOfNegatives = arrayService.countNegatives(numbersArray);
        logger.info(numberOfNegatives);
        ArraySorter arraySorter = new ArraySorter();
        int[] bubbleArray = arraySorter.bubbleSort(numbersArray);
        logger.info(Arrays.toString(bubbleArray));
        int[] selectionArray = arraySorter.selectionSort(numbersArray);
        logger.info(Arrays.toString(selectionArray));
        int[] insertionArray = arraySorter.insertionSort(numbersArray);
        logger.info(Arrays.toString(insertionArray));
        int[] streamSortedArray = arraySorter.streamSorter(numbersArray);
        logger.info(Arrays.toString(streamSortedArray));
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
