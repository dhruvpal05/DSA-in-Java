package Arrays.StriverSDE;

public class Grid {
    public int uniquePaths(int m, int n) {
        return countPaths(0,0,m,n);
    }
    int countPaths(int i,int j,int n,int m){
        if(i==(n-1)&&j==(m-1)) return 1;
        if(i>=n||j>=m) return 0;
        else return countPaths(i+1,j,n,m)+countPaths(i,j+1,n,m);
    }

    // int uniquePaths(int m, int n) {
    //    return countPaths(0,0,m,n);
    // }
}
