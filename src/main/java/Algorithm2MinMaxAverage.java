public class Algorithm2MinMaxAverage {

    /**
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     * <p>
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */


    public double[] minMaxAverageAlgorithm2(int[] array, int x, int y) {

        double sum = 0;
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        if (array.length != 0) {
            for (int i = x; i <= y; i++) {
                sum += array[i];
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return new double[]{min, max, sum / ((y - x) + 1)};
        }

        return new double[]{};

    }
}
