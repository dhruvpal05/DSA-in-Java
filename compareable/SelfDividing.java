package compareable;

import java.util.ArrayList;
import java.util.List;

public class SelfDividing {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i%10!=0 && i/10 > 0 && i%(i%10) == 0) {
                i = i/10;
                if (i<10) {
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
