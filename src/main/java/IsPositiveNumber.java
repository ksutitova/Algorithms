public class IsPositiveNumber {

  /**    Напишите алгоритм IsPositiveNumber, который возвращает true,
    если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
  Проверить 555, 0 и -555.
   */

    public boolean isPositiveNumberAlgorithm(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

}
