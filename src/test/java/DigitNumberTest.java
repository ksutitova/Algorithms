import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class DigitNumberTest {


    @Order(1)
    @Test
    public void testDigitNumberPozitivTwo() {
        short number = 89;
        String expectedResult = "It’s a two-digit number.";

        DigitNumber digitNumber = new DigitNumber();
        String actualResult = digitNumber.digitNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void testDigitNumberPozitivThree() {
        short number = 159;
        String expectedResult = "It’s a three-digit number.";

        DigitNumber digitNumber = new DigitNumber();
        String actualResult = digitNumber.digitNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testDigitNumberPozitivFour() {
        short number = 1059;
        String expectedResult = "It’s a four-digit number.";

        DigitNumber digitNumber = new DigitNumber();
        String actualResult = digitNumber.digitNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
