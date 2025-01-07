package BinarySearch;

import java.util.ArrayList;

public class KthElement {
    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 7, 9 };
        int[] b = { 1, 4, 8, 10 };
        System.out.println(kthElement(a, b, 5));
    }

    public static int kthElement1(int a[], int b[], int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            list.add(b[i]);
        }
        list.sort((x, y) -> x - y);
        return list.get(k - 1);
    }

    public static int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i == a.length) {
                return b[j + k - 1];
            }
            if (j == b.length) {
                return a[i + k - 1];
            }
            if (k == 1) {
                return Math.min(a[i], b[j]);
            }
            if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
            k--; 
        }
        return -1; 
    }
    

}
