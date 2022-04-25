import org.junit.jupiter.api.*;
import org.testng.annotations.Test;

import java.util.Arrays;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach
    void setUp(){
        as = new AscendingSequence();
    }

    @Order(1)
    @Test
    public void testAscendingSequenceHappyPath(){
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0,1,2,3,4,5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

       Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(2)
//    @RepeatedTest(5)
    @Test
//    @Disabled
    public void testAscendingSequenceHappyPathNeg(){
        int start = -10;
        int end = -5;
        int step = 1;
        int[] expectedResult= {-10,-9,-8,-7,-6,-5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);
        System.out.println(Arrays.toString(actualResult));

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testAscendingSequenceStepTwo(){
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0,2,4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegative(){
        int start = 0;
        int end = 5;
        int step = -2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeZero(){
        int start = 0;
        int end = 0;
        int step = -2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}


