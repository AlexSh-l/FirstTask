import com.alex.firsttask.entities.NumbersArray;
import com.alex.firsttask.exceptions.ArrayIndexException;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionsTest {

    static NumbersArray numbersArray;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        numbersArray.numbersArrayNewInstance(-12,22,-32,25,78,9);
    }

    @Test(expected = ArrayIndexException.class)
    public void arrayIndexExceptionTest() throws ArrayIndexException {
        numbersArray.getElementById(20);
    }

}
