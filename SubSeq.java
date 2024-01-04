import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str ="abcd";
        subseqAscii("",str);
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(ch+p, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> sub(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            System.out.println(p);
            return list;
        }
        char ch = up.charAt(0);
        String s  = String.valueOf(ch);
        list.add(s);
        return sub(ch +p, up.substring(1), list);

    }
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(ch+p, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }
}
