public class SumArray {

    public static int SumArrayAlgorithm(int[] array){
        if (array.length != 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            return sum;
        }
        return 0;
    }

}
