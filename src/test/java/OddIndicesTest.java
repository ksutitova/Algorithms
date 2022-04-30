import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Order(1)
    @Test
    public void oddIndicesTestHappy() {
        int[] input = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


    @Order(2)
    @Test
    public void OddIndicesTestHappyNull() {
        int[] input = new int[]{};
        int[] expectedResult = null;

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


    @Order(3)
    @Test
    public void OddIndicesTestNegativ() {
        int[] input = new int[]{1};
        int[] expectedResult = {};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
