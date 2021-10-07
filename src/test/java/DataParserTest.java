import com.alex.firsttask.exceptions.DataParserException;
import com.alex.firsttask.parsers.DataParser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DataParserTest {

    static List<String> data;
    static int[] array;

    @BeforeClass
    public static void initializeArray(){
        data = new ArrayList<>();
        data.add("regrevah8r3r");
        data.add("-12 22 -32 25 78 9");
        data.add("23r5");
        data.add("3 4 -5 67 -898");
        data.add("re");
        data.add("gr");
        array = new int[] {-12, 22, -32, 25, 78, 9, 3, 4, -5, 67, -898};
    }

    @Test
    public void parseDataTest(){
        DataParser parser = new DataParser();
        try {
            int[] expected = array;
            int[] actual = parser.parseData(data);
            Assert.assertArrayEquals(expected, actual);
        } catch (DataParserException e) {
            Assert.fail(e.getMessage());
        }
    }

}
