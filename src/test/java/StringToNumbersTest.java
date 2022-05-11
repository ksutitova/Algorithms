import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringToNumbersTest {

    @Test
    public void stringToNumbersTestHappy() {
        String str = "1, 2, 3, 4, 5";
        String expectedResult = "[1,  2,  3,  4,  5]";

        StringToNumbers stringToNumbers = new StringToNumbers();
        String actualResult = Arrays.toString(stringToNumbers.stringToNumbersAlgorithm(str));

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToNumbersTestHappyTwo() {
        String str = "Hello world";
        String expectedResult = "[Hello world]";

        StringToNumbers stringToNumbers = new StringToNumbers();
        String actualResult = Arrays.toString(stringToNumbers.stringToNumbersAlgorithm(str));

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
