package Recursion;

import java.util.ArrayList;

public class UniqueBS {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        ArrayList<String> list = new ArrayList<>();
        generateCombinations("", n, list);
        for(String num: nums){
            if (list.contains(num)) {
                list.remove(num);
            }
        }

        return list.get(0);
    }

    private static void generateCombinations(String prefix, int n, ArrayList<String> result) {
        if (n == 0) {
            result.add(prefix);
            return;
        }
        generateCombinations(prefix + "0", n - 1, result);
        generateCombinations(prefix + "1", n - 1, result);
    }
}
