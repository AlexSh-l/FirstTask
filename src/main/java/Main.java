import entity.NumbersArray;
import org.apache.logging.log4j.LogManager;
import service.*;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        NumbersArray numbersArray = new NumbersArray();
        var array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        logger.info(numbersArray.arrayToString());
        var minimumValueExtractor = new MinimumValueExtractor();
        var minimumValue = minimumValueExtractor.getMinimumValue(array);
        logger.info(minimumValue);
        var maximumValueExtractor = new MaximumValueExtractor();
        var maximumValue = maximumValueExtractor.getMaximumValue(array);
        logger.info(maximumValue);
        var averageValueCalculator = new AverageValueCalculator();
        var averageValue = averageValueCalculator.getAverageValue(array);
        logger.info(averageValue);
        var negativeValueInverter = new NegativeValueInverter();
        negativeValueInverter.invertNegativeValues(array);
        logger.info(numbersArray.arrayToString());
        var summaryCalculator = new SummaryCalculator();
        var summary = summaryCalculator.getSummary(array);
        logger.info(summary);
        var positiveValuesCounter = new PositiveValuesCounter();
        var numberOfPositives = positiveValuesCounter.countPositives(array);
        logger.info(numberOfPositives);
        var negativeValuesCounter = new NegativeValuesCounter();
        var numberOfNegatives = negativeValuesCounter.countNegatives(array);
        logger.info(numberOfNegatives);
    }

}
