import com.alex.entity.NumbersArray;
import com.alex.exceptions.ArrayIndexException;
import com.alex.filereader.NumbersReader;
import com.alex.service.implementation.*;
import com.alex.sorts.ArraySorter;
import com.alex.validator.Validation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        NumbersReader numbersReader = new NumbersReader();
        List<String> numbersRead = numbersReader.readNumbers();
        Validation validation = new Validation();
        int[] numbersList = validation.validateArray(numbersRead);
        NumbersArray numbersArray = new NumbersArray();
        int[] array = numbersArray.numbersArrayNewInstance(numbersList);
        logger.info(numbersArray.toString());
        ArrayServices arrayServices = new ArrayServices();
        int minimumValue = arrayServices.getMinimumValue(array);
        logger.info(minimumValue);
        int maximumValue = arrayServices.getMaximumValue(array);
        logger.info(maximumValue);
        float averageValue = arrayServices.getAverageValue(array);
        logger.info(averageValue);
        int[] invertedArray = arrayServices.invertNegativeValues(array);
        logger.info(Arrays.toString(invertedArray));
        int summary = arrayServices.getSummary(array);
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
