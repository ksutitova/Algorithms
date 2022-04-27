import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Order(1)
    @Test
    public void biggerValuePozitivTest() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void biggerValuePozitivTest2() {
        int a = 120;
        int b = 19;
        int expectedResult = 120;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void biggerValuePozitivTest3() {
        int a = -33;
        int b = 99;
        int expectedResult = 99;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(4)
    @Test
    public void biggerValueNegativTest() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(5)
    @Test
    public void biggerValuePozitivTest4() {
        int a = 0;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
