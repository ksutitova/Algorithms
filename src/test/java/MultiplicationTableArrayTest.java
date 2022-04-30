import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MultiplicationTableArrayTest {


    @Order(1)
    @Test
    public void multiplicationTableTest1() {
        int index = 2;
        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        MultiplicationTableArray multiplicationTableArray = new MultiplicationTableArray();
        int[] actualResult = multiplicationTableArray.multiplicationTable(index);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(1)
    @Test
    public void multiplicationTableTest2() {
        int index = 9;
        int[] expectedResult = {0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90};

        MultiplicationTableArray multiplicationTableArray = new MultiplicationTableArray();
        int[] actualResult = multiplicationTableArray.multiplicationTable(index);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

}
