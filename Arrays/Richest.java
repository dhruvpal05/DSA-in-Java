package Arrays;

public class Richest {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for (int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
        if (s>wealth){
            wealth=s; 
        }
        }
        return wealth;
    }
}
