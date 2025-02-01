package Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reshedule {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        List<int[]> intervals = new ArrayList<>();
        for (int i = 0; i < startTime.length; i++) {
            intervals.add(new int[]{startTime[i], endTime[i]});
        }
        intervals.sort(Comparator.comparingInt(a -> a[0]));
        int lastEnd = 0;
        List<Integer> gaps = new ArrayList<>();
        for (int[] interval : intervals) {
            int gap = interval[0] - lastEnd;
            gaps.add(gap);
            lastEnd = interval[1];
        }
        int finalGap = eventTime - lastEnd;
        if (finalGap != 0) {
            gaps.add(finalGap);
        }
        int left = 0, right = 0;
        int currentSum = 0, maxGap = 0;
        int n = gaps.size();
        while (right <= k && right < n) {
            currentSum += gaps.get(right);
            right++;
        }
        maxGap = currentSum;
        if (right == n) {
            return currentSum;
        }
        while (right < n) {
            currentSum += gaps.get(right) - gaps.get(left);
            right++;
            left++;
            maxGap = Math.max(currentSum, maxGap);
        }
        return maxGap;
    }
}
