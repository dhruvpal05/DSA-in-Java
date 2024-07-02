package compareable;

public class Prettier {
    public static void main(String[] args) {
    }
    public int[][] prettyPrint(int A) {
        int size = 2 * A - 1;
        int[][] ans = new int[size][size];
        
        for (int i = 0; i < A; i++) {
            for (int j = i; j < size - i; j++) {
                ans[i][j] = A - i;
                ans[j][i] = A - i;
                ans[size - 1 - i][j] = A - i;
                ans[j][size - 1 - i] = A - i;
            }
        }
        
        return ans;
    }
}
