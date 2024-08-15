package DP;

public class Cookies {
    public int findContentChildren(int[] g, int[] s) {
        int childs = g.length-1;
        int cookies = s.length-1;
        while (childs - 1 >= 0) {
            if (s[cookies] >= g[childs]) {
                return g[childs-1];
            }
            cookies--;
            if (cookies == 0) {
                childs--;
                cookies = s.length-1;
            }
        }
        return 0;
    }
}
