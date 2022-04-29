import java.util.Arrays;

public class MinMaxAve {

    /**
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее между 2-мя индексами.
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public static double[] minMaxAveAlgorithm(int[] array, int x, int y) {
        double aver = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        if (array.length != 0) {
            min = Math.min(array[x], array[y]);
            max = Math.max(array[x], array[y]);
            aver = (array[x] + array[y]) / 2;
            double[] result = new double[]{min, max, aver};
            return result;
        }

        return null;
    }
}
