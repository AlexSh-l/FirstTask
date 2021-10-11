import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.service.implementation.ArrayService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayServiceTest {

    private static NumbersArray numbersArray;
    private static ArrayService arrayService;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        numbersArray.setArray(-12,22,-32,25,78,9);
        arrayService = new ArrayService();
    }

    @Test
    public void countAverageValueTest(){
        float expected = 15.0f;
        float actual = arrayService.countAverageValue(numbersArray);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void findMaximumValueTest(){
        int expected = 78;
        int actual = arrayService.findMaximumValue(numbersArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMinimumValueTest(){
        int expected = -32;
        int actual = arrayService.findMinimumValue(numbersArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertNegativeValuesTest(){
        int[] expected = new int[] {12,22,32,25,78,9};
        int[] actual = arrayService.invertNegativeValues(numbersArray);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countNegativesTest(){
        int expected = 2;
        int actual = arrayService.countNegatives(numbersArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countPositivesTest(){
        int expected = 4;
        int actual = arrayService.countPositives(numbersArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countSummaryTest(){
        int expected = 90;
        int actual = arrayService.countSummary(numbersArray);
        Assert.assertEquals(expected, actual);
    }

}
