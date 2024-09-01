package Arrays;

public class FirstBadVersion {
    // O(n)
    public int firstBadVersion1(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return -1;
    }

    // O(logn)
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = -1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)) {
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return ans;
    }

    private boolean isBadVersion(int i) {
        // some internal code
        return false;
    }
}
