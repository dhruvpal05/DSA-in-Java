public class FiboRec {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(ans);
        
    }

    static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int ans = fib(n-1) + fib(n-2);
        return ans;
    }
}
