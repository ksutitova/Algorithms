public class MultiplicationTableArray {
      /**  Алгоритм, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
        и возвращает таблицу умножения на это число в виде массива
        Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
       */

    public int[] multiplicationTable(int index){
        int[] multiplicationTable = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        if(index > 1 && index < 10){
            for (int i = 0; i < multiplicationTable.length ; i++) {
                multiplicationTable[i] = multiplicationTable[i] * index;
            }
        } else {
            return null;
        }
        return multiplicationTable;
    }


}
