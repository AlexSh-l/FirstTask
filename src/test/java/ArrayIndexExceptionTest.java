import com.alex.entity.NumbersArray;
import com.alex.exceptions.ArrayIndexException;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayIndexExceptionTest {

    static NumbersArray numbersArray;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
    }

    @Test(expected = ArrayIndexException.class)
    public void arrayIndexExceptionTest() throws ArrayIndexException{
        numbersArray.getElementById(20);
    }

}