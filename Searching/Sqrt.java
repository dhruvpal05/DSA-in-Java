package Searching;

public class Sqrt {
    public int mySqrt(int x) {
        // int ans = (int)Math.pow(x, 0.5);
        // Math.floor(ans);
        // return ans;
        int l = 0;
        int r = x;
        int ans = 0;
        while (l<=r) {
            int m = l + ((r-l)/2);
            if(Math.pow(m, 2) > x){
                m = m -1;
            }
            else if(Math.pow(m, 2)<x){
                l = m+1;
                ans = m;
            }else{
                return m;
            }
        }
        return ans;
    }
}
