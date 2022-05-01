import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerAlgorithmTest {

    @Order(1)
    @Test
    public void biggerPozitivTest() {
        int n1 = 3333;
        int n2 = 9999;
        int expectedResult = 9999;

        BiggerAlgorithm biggerAlgorithm = new BiggerAlgorithm();
        int actualResult = biggerAlgorithm.biggerAlgorithm(n1,n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
