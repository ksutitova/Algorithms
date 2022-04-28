public class MaxOfThree {

    public static int returnMaxOfThree(int x, int y, int z){
        int max;
        if( x > y) {
            max = x;
        } else {
            max = y;
        }
        if (z > x && z > y) {
            max = z;
        }
        return max;
    }

}
