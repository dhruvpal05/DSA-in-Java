package Searching;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PatternRec {
    public static void main(String[] args) {
        // pattern1(4, 0);
        int[] arr = {2,1,3,8,4,7};
        // bubble(arr, arr.length -1, 0);
        selection(arr, arr.length -1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.println("*");
            pattern1(r, c+1);
        }else{
            System.out.println();
            pattern1(r-1, 0);
        }
    }

    static void bubble(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr,r, c+1);
        }else{
            bubble(arr,r-1, 0);
        }
    } 

    static void selection(int[] arr,int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>max){
                max = arr[c];
            }
            selection(arr,r, c+1,max);
        }else{
            
            selection(arr,r-1, 0,max);
        }
    } 
}
