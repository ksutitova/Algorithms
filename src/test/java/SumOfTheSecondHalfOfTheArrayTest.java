import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumOfTheSecondHalfOfTheArrayTest {

    @Order(1)
    @Test
    public void sumOfTheSecondHalfOfTheArrayTest() {
        int[]array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 12;

        SumOfTheSecondHalfOfTheArray sumOfTheSecondHalfOfTheArray = new SumOfTheSecondHalfOfTheArray();
        int actualResult = sumOfTheSecondHalfOfTheArray.sumOfTheSecondHalfOfTheArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void sumOfTheSecondHalfOfTheArrayTestTwo() {
        int[]array = {0, 1, 0, 7, 0, 5};
        int expectedResult = 12;

        SumOfTheSecondHalfOfTheArray sumOfTheSecondHalfOfTheArray = new SumOfTheSecondHalfOfTheArray();
        int actualResult = sumOfTheSecondHalfOfTheArray.sumOfTheSecondHalfOfTheArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
