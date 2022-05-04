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
    public void testEstimationHappy() {
        int n = 5;
        String expectedResult = "выдать похвальную грамоту и перевести в следующий класс";

        Estimation estimation = new Estimation();
        String actualResult = estimation.estimationAlgorithm(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
