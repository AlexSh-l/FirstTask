import entity.NumbersArray;
import org.junit.Assert;
import org.junit.Test;
import service.SummaryCalculator;

public class SummaryCalculatorTest {

    @Test
    public void summaryTest(){
        NumbersArray numbersArray = new NumbersArray();
        var array = numbersArray.numbersArrayNewInstance(12,22,32,25,78,9);
        var summaryCalculator = new SummaryCalculator();
        var summary = summaryCalculator.getSummary(array);
        Assert.assertEquals(178, summary);
    }

}
