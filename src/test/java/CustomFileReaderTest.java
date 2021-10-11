import com.alex.firsttask.exception.FileReaderException;
import com.alex.firsttask.filereader.implementation.CustomFileReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReaderTest {

    private static List<String> list;

    @BeforeClass
    public static void initializeList(){
        list = new ArrayList<>();
        list.add("regrevah8r3r");
        list.add("-12 22 -32 25 78 9");
        list.add("23r5");
        list.add("3 4 -5 67  -898");
        list.add("re");
        list.add("gr");
    }

    @Test
    public void readFileTest(){
        CustomFileReader customFileReader = new CustomFileReader();
        try {
            List<String> expected = list;
            if(customFileReader.readFile().isPresent()) {
                List<String> actual = customFileReader.readFile().get();
                Assert.assertEquals(expected, actual);
            }else{
                Assert.fail("readFileTest failed");
            }
        } catch (FileReaderException e) {
            Assert.fail(e.getMessage());
        }
    }

}
