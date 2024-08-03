
public class MaxPoints {
    public static int maxpoints(int[] arr, int k){
        int l = 0;
        int r = k - 1;
        int maxsum = 0;
        for (int i = l; i <= r; i++) {
            maxsum+=arr[i];
        }
        int sum = maxsum;
        Math.max(maxsum,sum);
        while (r>arr.length-1) {
            maxsum-=arr[l];
            l++;
            r++;
            maxsum+=arr[r];
            Math.max(maxsum,sum);
        }

        return sum;
    }

    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;

        for (int i = 0; i <= k-1; i++) {
            lsum += cardPoints[i];
        }
        maxsum = lsum;

        int rindex = cardPoints.length -1;
        for (int i = k-1; i >= 0; i--) {
            lsum-=cardPoints[i];
            rsum += cardPoints[rindex];
            rindex--;
            maxsum = Math.max(maxsum, lsum+rsum);
        }
        
        return maxsum;
    }
}
