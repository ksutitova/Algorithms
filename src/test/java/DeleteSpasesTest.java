import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteSpasesTest {

    @Test
    public void deleteSpacesHappy() {
        String str = "    QA for Everyone ";
        String expectedResult = "Лишние пробелы удалены";

        DeleteSpases deleteSpases = new DeleteSpases();
        String actualResult = deleteSpases.deleteSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void deleteSpacesHappyTwo() {
        String str = "QA for Everyone";
        String expectedResult = "Пробелов не было";

        DeleteSpases deleteSpases = new DeleteSpases();
        String actualResult = deleteSpases.deleteSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

