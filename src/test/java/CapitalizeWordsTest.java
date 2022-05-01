import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CapitalizeWordsTest {


    @Test
    public void testCapitalizeWordsPozitiv() {
        String str = "       happy birthday!  ";
        String expectedResult = "Happy Birthday!";

        CapitalizeWords capitalizeWords = new CapitalizeWords();
        String actualResult = capitalizeWords.capitalizeWordsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testCapitalizeWordsPozitivTwo() {
        String str = "       john jacob smith jr. ";
        String expectedResult = "John Jacob Smith Jr.";

        CapitalizeWords capitalizeWords = new CapitalizeWords();
        String actualResult = capitalizeWords.capitalizeWordsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testCapitalizeWordsPozitivThree() {
        String str = "      какая чудесная погода! ";
        String expectedResult = "Какая Чудесная Погода!";

        CapitalizeWords capitalizeWords = new CapitalizeWords();
        String actualResult = capitalizeWords.capitalizeWordsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testCapitalizeWordsPozitivFour() {
        String str = "      привет андрей! ";
        String expectedResult = "Привет Андрей!";

        CapitalizeWords capitalizeWords = new CapitalizeWords();
        String actualResult = capitalizeWords.capitalizeWordsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCapitalizeWordsNeg() {
        String str = " ";
        String expectedResult = "";

        CapitalizeWords capitalizeWords = new CapitalizeWords();
        String actualResult = capitalizeWords.capitalizeWordsAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
