package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        RevDiagonal(nums);

    }

    public static void RevDiagonal(int[][] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(nums[i][n - 1 - i]);
        }
    }
}
