import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberVarTwoTest {

    @Order(1)
    @Test
    public void isPositiveNumberTestHappy() {
        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumberVarTwo isPositiveNumberVarTwo = new IsPositiveNumberVarTwo();
        boolean actualResult = isPositiveNumberVarTwo.isPositiveNumberAlgorithmVarTwo(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void isPositiveNumberTestHappyTwo() {
        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumberVarTwo isPositiveNumberVarTwo = new IsPositiveNumberVarTwo();
        boolean actualResult = isPositiveNumberVarTwo.isPositiveNumberAlgorithmVarTwo(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
