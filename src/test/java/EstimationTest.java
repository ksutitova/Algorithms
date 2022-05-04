import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class EstimationTest {

//        if (estimation == 5) {
//            return "выдать похвальную грамоту и перевести в следующий класс";
//        }
//        if (estimation == 4) {
//            return "перевести в следующий класс";
//        }
//        if (estimation == 3) {
//            return "дать задание на лето и перевести в следующий класс";
//        }
//        if (estimation == 2) {
//            return "вызвать родителей и оставить в текущем классе на второй год";
//        return "Fail";


    @Order(1)
    @Test
    public void testEstimationHappy5() {
        int n = 5;
        String expectedResult = "выдать похвальную грамоту и перевести в следующий класс";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(2)
    @Test
    public void testEstimationHappy4() {
        int n = 4;
        String expectedResult = "перевести в следующий класс";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testEstimationHappy3() {
        int n = 3;
        String expectedResult = "дать задание на лето и перевести в следующий класс";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(4)
    @Test
    public void testEstimationHappy2() {
        int n = 2;
        String expectedResult = "вызвать родителей и оставить в текущем классе на второй год";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testEstimationNeg() {
        int n = 10;
        String expectedResult = "Fail";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
