public class RepeatedStr {
    public int repeatedStringMatch(String a, String b) {
        int ans = 1;
        if (b.contains(a)) {
            while (!a.contains(b)) {
                a+=a;
                ans++;
            }
        }else{
            return -1;
        }
        return ans;
    }
}
