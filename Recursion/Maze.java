package Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(maze(3, 3));
        System.out.println(printMaze(3, 3));

    }

    public static int maze(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return maze(n - 1, m) + maze(n, m - 1);
    }

    public static ArrayList<String> printMaze(int r, int c) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder p = new StringBuilder();
        helper(res, p, r, c);
        return res;
    }

    private static void helper(ArrayList<String> res, StringBuilder p, int r, int c) {
        if(r==1&&c==1){
            res.add(p.toString());
        }
        if(r>1){
            p.append("D");
            helper(res, p, r-1, c);
            p.deleteCharAt(p.length()-1);
        }
        if(c>1){
            p.append("R");
            helper(res, p, r, c-1);
            p.deleteCharAt(p.length()-1);
        }
    }

    // 1234
    // 1234
    // 1234
    // 1234

}
