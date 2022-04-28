import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class GetMultipleOfThreeAndFiveTest {


    @Order(1)
    @Test
    public void getMultipleOfThreeAndFivePozitivTest() {
        int m = 15;
        String expectedResult = "Хорошее число";

        GetMultipleOfThreeAndFive getMultipleOfThreeAndFive = new GetMultipleOfThreeAndFive();
        String actualResult = getMultipleOfThreeAndFive.getMultipleOfThreeAndFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void getMultipleOfThreeAndFivePozitivTest2() {
        int m = 9;
        String expectedResult = "Неверное число";

        GetMultipleOfThreeAndFive getMultipleOfThreeAndFive = new GetMultipleOfThreeAndFive();
        String actualResult = getMultipleOfThreeAndFive.getMultipleOfThreeAndFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void getMultipleOfThreeAndFivePozitivTest3() {
        int m = 5;
        String expectedResult = "Номер детали";

        GetMultipleOfThreeAndFive getMultipleOfThreeAndFive = new GetMultipleOfThreeAndFive();
        String actualResult = getMultipleOfThreeAndFive.getMultipleOfThreeAndFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(4)
    @Test
    public void getMultipleOfThreeAndFivePozitivTest4() {
        int m = 7;
        String expectedResult = "-1";

        GetMultipleOfThreeAndFive getMultipleOfThreeAndFive = new GetMultipleOfThreeAndFive();
        String actualResult = getMultipleOfThreeAndFive.getMultipleOfThreeAndFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(5)
    @Test
    public void getMultipleOfThreeAndFivePozitivTestZero() {
        int m = 0;
        String expectedResult = "-1";

        GetMultipleOfThreeAndFive getMultipleOfThreeAndFive = new GetMultipleOfThreeAndFive();
        String actualResult = getMultipleOfThreeAndFive.getMultipleOfThreeAndFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
