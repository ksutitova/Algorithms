import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.testng.annotations.Test;

public class Algorithm2MinMaxAverageTest {


    @Order(1)
    @Test
    public void testMinMaxAveHappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int y = 6;
        double[] expectedResult = {3, 7, 5};

        Algorithm2MinMaxAverage algorithm2MinMaxAverage = new Algorithm2MinMaxAverage();
        double[] actualResult = algorithm2MinMaxAverage.minMaxAverageAlgorithm2(array,x,y);


        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testMinMaxAveHappyPathZero() {
        int[] array = {};
        int x = 2;
        int y = 6;
        double[] expectedResult = new double[]{};

        Algorithm2MinMaxAverage algorithm2MinMaxAverage = new Algorithm2MinMaxAverage();
        double[] actualResult = algorithm2MinMaxAverage.minMaxAverageAlgorithm2(array,x,y);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMinMaxAveHappy() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 0;
        int y = 2;
        double[] expectedResult = {1, 3, 2};

        Algorithm2MinMaxAverage algorithm2MinMaxAverage = new Algorithm2MinMaxAverage();
        double[] actualResult = algorithm2MinMaxAverage.minMaxAverageAlgorithm2(array,x,y);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Order(4)
    @Test
    public void testMinMaxAveHappyNeg() {
        int[] array = {-1, 2, 3, 4, 5, 6, 7, 8};
        int x = 0;
        int y = 3;
        double[] expectedResult = {-1, 4, 2};

        Algorithm2MinMaxAverage algorithm2MinMaxAverage = new Algorithm2MinMaxAverage();
        double[] actualResult = algorithm2MinMaxAverage.minMaxAverageAlgorithm2(array,x,y);


        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
