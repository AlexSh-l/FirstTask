import com.alex.firsttask.entity.NumbersArray;
import com.alex.firsttask.exception.ArrayIndexException;
import com.alex.firsttask.exception.FileReaderException;
import com.alex.firsttask.filereader.implementation.CustomFileReader;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTest {

    private static NumbersArray numbersArray;

    @BeforeClass
    public static void initializeArray(){
        numbersArray = new NumbersArray();
        numbersArray.setArray(-12,22,-32,25,78,9);
    }

    @Test(expected = ArrayIndexException.class)
    public void arrayIndexExceptionTest() throws ArrayIndexException {
        numbersArray.getElementById(20);
    }

    @Test(expected = FileReaderException.class)
    public void fileReaderExceptionTest() throws FileReaderException {
        CustomFileReader customFileReader = new CustomFileReader();
        customFileReader.readFile("str");
    }

}
