import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void oddEvenTestHappy() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEvenTestHappy2() {
        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEvenTestHappy3() {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEvenTestNeg() {
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}