import java.util.ArrayList;
import java.util.HashMap;

public class KthDistinctStr {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }
        @SuppressWarnings({ "unchecked", "rawtypes" })
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (mp.get(arr[i]) == 1) {
                list.add(arr[i]);
            }
        }

        if (k>list.size()) {
            return "";
        }
        return list.get(k-1);
    }
}
