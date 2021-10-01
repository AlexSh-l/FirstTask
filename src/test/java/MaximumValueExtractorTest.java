import entity.NumbersArray;
import org.junit.Assert;
import org.junit.Test;
import service.MaximumValueExtractor;
import service.SummaryCalculator;

public class MaximumValueExtractorTest {

    @Test
    public void maximumValueTest(){
        NumbersArray numbersArray = new NumbersArray();
        var array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        var maximumValueExtractor = new MaximumValueExtractor();
        var maximumValue = maximumValueExtractor.getMaximumValue(array);
        Assert.assertEquals(78, maximumValue);
    }

}
