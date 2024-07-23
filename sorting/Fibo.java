public class Fibo {
    public static void main(String[] args) {
        
    }

    /**
     * InnerFibo
     */
    public static int FiboRecersive(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return FiboRecersive(n-1)+FiboRecersive(n-2); 
    }

    public static int FiboIterative(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
