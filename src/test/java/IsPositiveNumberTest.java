import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void OddIndicesTestHappy() {
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }





}
