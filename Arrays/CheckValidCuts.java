package Arrays;

import java.util.Arrays;

public class CheckValidCuts {

    public boolean checkValidCuts(int n, int[][] rectangles) {
        Arrays.sort(rectangles, (a, b) -> a[0] - b[0]);
        int gaps = 0;
        int previousEnd = 0;
        for (int[] rectangle : rectangles) {
            int start = rectangle[0];
            int end = rectangle[2];

            if (previousEnd != 0 && start >= previousEnd)
                gaps++;

            previousEnd = Math.max(end, previousEnd);
        }

        if (gaps >= 2)
            return true;

        Arrays.sort(rectangles, (a, b) -> a[1] - b[1]);
        gaps = 0;
        previousEnd = 0;
        for (int[] rectangle : rectangles) {

            int start = rectangle[1];
            int end = rectangle[3];

            if (previousEnd != 0 && start >= previousEnd)
                gaps++;

            previousEnd = Math.max(end, previousEnd);
        }

        System.out.println(gaps);

        if (gaps >= 2)
            return true;

        return false;

    }
}