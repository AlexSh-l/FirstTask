import com.alex.entity.NumbersArray;
import com.alex.service.implementation.ArrayServices;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayServicesTest {

    static int[] array;
    static ArrayServices arrayServices;

    @BeforeClass
    public static void initializeArray(){
        NumbersArray numbersArray = new NumbersArray();
        array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        arrayServices = new ArrayServices();
    }

    @Test
    public void getAverageValueTest(){
        float expected = 15.0f;
        float actual = arrayServices.getAverageValue(array);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void maximumValueTest(){
        int expected = 78;
        int actual = arrayServices.getMaximumValue(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinimumValueTest(){
        int expected = -32;
        int actual = arrayServices.getMinimumValue(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invertNegativeValuesTest(){
        int[] expected = new int[] {12,22,32,25,78,9};
        int[] actual = arrayServices.invertNegativeValues(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void countNegativesTest(){
        int expected = 2;
        int actual = arrayServices.countNegatives(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countPositivesTest(){
        int expected = 4;
        int actual = arrayServices.countPositives(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSummaryTest(){
        int expected = 90;
        int actual = arrayServices.getSummary(array);
        Assert.assertEquals(expected, actual);
    }

}
