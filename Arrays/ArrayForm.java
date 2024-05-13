package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        // List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < String.valueOf(k).length(); i++) {
            num[num.length -1-i] = k%10;
            k/=10;
        }
        List<Integer> list = Arrays.asList(Arrays.stream(num).boxed().toArray(Integer[]::new));
        return list;
    }
}
