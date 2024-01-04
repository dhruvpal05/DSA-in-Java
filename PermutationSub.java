import java.util.ArrayList;

public class PermutationSub {
    public static void main(String[] args) {
        // permuation("", "abc");
        ArrayList<String> list = new ArrayList<>();
        list = permutationList("", "abc", list);
        System.out.println(list);
        System.out.println('a'+1);
    }

    static void permuation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            permuation(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s, up.substring(1),list));
        }
        return ans;
    }
}
