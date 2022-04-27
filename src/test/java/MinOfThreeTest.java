import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinOfThreeTest {


    @Order(1)
    @Test
    public void returnMinOfThreePozitivTest() {
        int a = 1000;
        int b = 2;
        int c = 56;
        int expectedResult = 2;

        MinOfThree minOfThree = new MinOfThree();
        int actualResult = minOfThree.returnMinOfThreeAlgorithm(a,b,c);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void returnMinOfThreePozitivTest2() {
        int a = 0;
        int b = 34;
        int c = 34;
        int expectedResult = 0;

        MinOfThree minOfThree = new MinOfThree();
        int actualResult = minOfThree.returnMinOfThreeAlgorithm(a,b,c);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void returnMinOfThreeNegTest() {
        int a = 0;
        int b = 0;
        int c = 0;
        int expectedResult = 0;

        MinOfThree minOfThree = new MinOfThree();
        int actualResult = minOfThree.returnMinOfThreeAlgorithm(a,b,c);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void returnMinOfThreeNegTest2() {
        int a = 0;
        int b = -2;
        int c = 56;
        int expectedResult = -2;

        MinOfThree minOfThree = new MinOfThree();
        int actualResult = minOfThree.returnMinOfThreeAlgorithm(a,b,c);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
