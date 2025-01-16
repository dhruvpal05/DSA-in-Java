package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class PrefixComm {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] prefixCommon = new int[n];
        HashSet<Integer> seen = new HashSet<>();
        int commonCount = 0;
        for (int i = 0; i < n; i++) {
            if (!seen.add(A[i])) {
                commonCount++;
            }
            if (!seen.add(B[i])) {
                commonCount++;
            }
            prefixCommon[i] = commonCount;
        }
        return prefixCommon;
    }

}
