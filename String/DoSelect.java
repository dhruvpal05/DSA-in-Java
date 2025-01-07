public class DoSelect {
    public static void main(String[] args) {
        System.out.println(Solve("jdhojbsemnllnjeckntn"));
    }

    public static String Solve(String s) {
        StringBuilder sb = new StringBuilder(s);
        String str = "doselect";
        int j = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == str.charAt(j)) {
                j++;
                if (j >= str.length()) {
                    break;
                }
            }
        }
        if (j == str.length()) {
            return "yes";
        }
        return "NO";
    }
}
