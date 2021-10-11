import com.alex.firsttask.validator.implementation.CustomValidator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomValidatorTest {

    private static CustomValidator customValidator;

    @BeforeClass
    public static void initializeArray(){
        customValidator = new CustomValidator();
    }

    @Test
    public void validateArrayTest() {
        boolean actual = customValidator.validateArray("-12 22 -32 25 78 9");
        Assert.assertTrue(actual);
    }

}
