package Arrays.StriverSDE;

public class Pow {
    public double myPow1(double x, int n) {
        return Math.pow(x, n);
    }
    
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double ans = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            if ((N % 2) == 1) {
                ans *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }
        
        return ans;
    }
    
}
