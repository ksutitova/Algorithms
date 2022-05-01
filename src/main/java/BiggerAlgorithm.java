public class BiggerAlgorithm {

    public int biggerAlgorithm(int n1, int n2) {
        if (n1 == n2) {
            return n1 - n2;
        }
        int max = 0;
        if (n1 < n2) {
            max = n2;
        } else {
            max = n1;
        }
        return max;
    }
}
