package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges.get(u).add(v);
            edges.get(v).add(u);
        }
    }

    public static void print(int[][] edges){
        int n = edges.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(edges[i][j] + " ");
            }
            System.out.println();
        }
    }
}
