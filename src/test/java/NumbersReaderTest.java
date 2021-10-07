import com.alex.firsttask.exceptions.FileReaderException;
import com.alex.firsttask.filereaders.NumbersReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class NumbersReaderTest {

    static List<String> text;

    @BeforeClass
    public static void initializeText(){
        text = new ArrayList<>();
        text.add("regrevah8r3r");
        text.add("-12 22 -32 25 78 9");
        text.add("23r5");
        text.add("3 4 -5 67 -898");
        text.add("re");
        text.add("gr");
    }

    @Test
    public void readNumbersTest(){
        NumbersReader numbersReader = new NumbersReader();
        try {
            List<String> expected = text;
            List<String> actual = numbersReader.readNumbers();
            Assert.assertEquals(expected, actual);
        } catch (FileReaderException e) {
            Assert.fail(e.getMessage());
        }
    }

}
