package Searching;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MazePathRec {
    public static void main(String[] args) {
        // mazepath("", 3, 3);
        // ArrayList<String> list  =  new ArrayList<>();
        System.out.println(mazepathlistDiagonal("", 3, 3));

    }

    static void mazepath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            mazepath(p +'D', r-1, c);
        }
        if(c > 1){
            mazepath(p+'R', r, c-1);
        }
    }

    static ArrayList<String> mazepathlist(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list  =  new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list  =  new ArrayList<>();
        if(r > 1){
            list.addAll(mazepathlist(p +'D', r-1, c));
        }
        if(c > 1){
            list.addAll(mazepathlist(p+'R', r, c-1));
        }
        return list;
    }
    static ArrayList<String> mazepathlistDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list  =  new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list  =  new ArrayList<>();
        if(r > 1){
            list.addAll(mazepathlistDiagonal(p +'D', r-1, c));
        }
        if(c > 1){
            list.addAll(mazepathlistDiagonal(p+'R', r, c-1));
        }
        if(c > 1 && r > 1){
            list.addAll(mazepathlistDiagonal(p+'d', r-1, c-1));
        }
        return list;
    }
}
