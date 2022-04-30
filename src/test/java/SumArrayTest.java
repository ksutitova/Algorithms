import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    @Order(1)
    @Test
    public void sumArrayPozitivTest() {
        int[]array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void SumArrayPozitivTest2() {
        int[]array = {-7, -3};
        int expectedResult = -10;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void SumArrayNegativTest() {
        int[]array = {};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.SumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
