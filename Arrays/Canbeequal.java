import java.util.HashMap;

public class Canbeequal {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < target.length; i++) {
            if (map.containsKey(target[i])) {
                map.put(target[i], map.get(target[i]+1));
            }else{
                map.put(target[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (map.get(arr[i])>1) {
                    map.put(arr[i], map.get(arr[i])-1);
                }else{
                    map.remove(arr[i]);
                }
            }else{
                return false;
            }
        }

        return true;
    }

    private void check(int i, int[] arr) {

    }
}
