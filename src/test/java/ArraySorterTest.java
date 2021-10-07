import com.alex.firsttask.entities.NumbersArray;
import com.alex.firsttask.sorts.ArraySorter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySorterTest {

    static int[] array;
    static ArraySorter arraySorter;
    static NumbersArray numbersArray;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        arraySorter = new ArraySorter();
    }

    @Test
    public void bubbleSortTest(){
        array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.bubbleSort(array);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void selectionSortTest(){
        array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.selectionSort(array);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSortTest(){
        array = numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
        int[] expected = new int[] {-32,-12,9,22,25,78};
        int[] actual = arraySorter.insertionSort(array);
        Assert.assertArrayEquals(expected,actual);
    }

}
