package Bitmanipulation;

public class NotDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,2,5,6};
        System.out.println(notdupli(arr));
    }

    private static int notdupli(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans = ans^i;
        }
        return ans;
    }
}
