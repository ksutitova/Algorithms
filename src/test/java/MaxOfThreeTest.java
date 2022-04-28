import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MaxOfThreeTest {

    @Order(1)
    @Test
    public void testMaxOfThreePozitiv() {
        int x = 5;
        int y = 45;
        int z = 30;
        int expectedResult = 45;

        MaxOfThree maxOfThree = new MaxOfThree();
        int actualResult = maxOfThree.returnMaxOfThree(x,y,z);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void testMaxOfThreePozitiv2() {
        int x = 115;
        int y = 0;
        int z = 30;
        int expectedResult = 115;

        MaxOfThree maxOfThree = new MaxOfThree();
        int actualResult = maxOfThree.returnMaxOfThree(x,y,z);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testMaxOfThreePozitivZero() {
        int x = 0;
        int y = 0;
        int z = 0;
        int expectedResult = 0;

        MaxOfThree maxOfThree = new MaxOfThree();
        int actualResult = maxOfThree.returnMaxOfThree(x,y,z);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
