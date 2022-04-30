public class SumOfTheSecondHalfOfTheArray {

     /** метод, который принимает массив целых чисел и считает сумму чисел
      во второй половине массива */

    public int sumOfTheSecondHalfOfTheArrayAlgorithm(int[] array){
        int sum = 0;
        for (int i = array.length / 2; i < array.length  ; i++){
            sum = sum + array[i];
        }
        return sum;
    }



}
