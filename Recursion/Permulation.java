package Recursion;

public class Permulation {
    public static void main(String[] args) {
        // perm("", "abc");
        Kthperm("", "abc", 3);
    }

    static void perm(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            perm(p.substring(0,i)+ch+p.substring(i), up.substring(1));
        }
    }


    static int count = 0; 

    static void Kthperm(String p, String up, int n) {
        if (up.isEmpty()) {
            count++;
            if (count == n) {
                System.out.println(p); 
            }
            return;
        }

        char ch = up.charAt(0);
        for (int j = 0; j <= p.length(); j++) {
            String newP = p.substring(0, j) + ch + p.substring(j);
            Kthperm(newP, up.substring(1), n);
            if (count == n) return;
        }
    }
}
