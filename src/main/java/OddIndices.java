import java.util.Arrays;

public class OddIndices {

    /**
     * алгоритм OddIndices, который принимает массив чисел,
     * и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] oddIndicesAlgorithm(int[] array) {
        if (array.length != 0) {
            int count = 0;
            int[] arrOdd = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    arrOdd[count] = array[i];
                    count++;
                }
            }

            return Arrays.copyOf(arrOdd, count);
        }
        return null;
    }


}
