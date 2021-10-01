import entity.NumbersArray;
import org.junit.Assert;
import org.junit.Test;
import service.PositiveValuesCounter;

public class PositiveValuesCounterTest {

    @Test
    public void countPositivesTest(){
        NumbersArray numbersArray = new NumbersArray();
        var array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        var positiveValuesCounter = new PositiveValuesCounter();
        var numberOfPositives = positiveValuesCounter.countPositives(array);
        Assert.assertEquals(4, numberOfPositives);
    }

}
