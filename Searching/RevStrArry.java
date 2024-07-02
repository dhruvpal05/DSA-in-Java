package Searching;
public class RevStrArry {
    public static void main(String[] args) {
        char[] s = new char[5];
        s = {"h","e","l","l","o"};
        
    }

    static void revStr(char[] s){
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i];
            s[s.length - i] = s[i];
        }
        System.out.println();

    }
}
