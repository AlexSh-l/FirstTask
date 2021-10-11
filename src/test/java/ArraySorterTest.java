import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.sort.implementation.ArraySorter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySorterTest {

    private static NumbersArray numbersArray;
    private static ArraySorter arraySorter;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        arraySorter = new ArraySorter();
        numbersArray.setArray(-12,22,-32,25,78,9);
    }

    @Test
    public void bubbleSortTest(){
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.bubbleSort(numbersArray);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void selectionSortTest(){
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.selectionSort(numbersArray);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSortTest(){
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.insertionSort(numbersArray);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void streamSorterTest(){
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.streamSorter(numbersArray);
        Assert.assertArrayEquals(expected,actual);
    }

}
