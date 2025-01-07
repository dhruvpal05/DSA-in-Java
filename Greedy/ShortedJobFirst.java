package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShortedJobFirst {
    // public int job(int[] nums){
    //     int n = nums.length;
    //     int t = 0;
    //     int wait = 0;
    //     Arrays.sort(nums);
    //     for(int i=0;i<n;i++){
    //         wait = wait+t;
    //         t+=nums[i];
    //     }
    //     return wait/n;
    // }
    // public static void main(String[] args) {
    //     ShortedJobFirst sjf = new ShortedJobFirst();
    //     int[] nums = {4,3,7,1,2};
    //     System.out.println(sjf.job(nums));
    // }

    public static int fibo(int n,int[] nums){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(nums[n]!=0){
            return nums[n];
        }
        nums[n] = fibo(n-1,nums)+fibo(n-2,nums);
        return nums[n];
    }

    public static void main(String[] args) {
        // System.out.println(fibo(10,new int[11]));
        // System.out.println(8/10);
        // System.out.println(count(88));
        // System.out.println(reverse(123));
        StringBuilder s = new StringBuilder("aababab");
        int n = s.length();
        System.out.println(s);
        ArrayList<String> list = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            list.add(s.substring(i-1,i));
        }
        System.out.println(list);
        Collections.sort(list);
        StringBuilder ans = new StringBuilder(String.valueOf(list));
        System.out.println(ans);
        ans.reverse();
        // System.out.println(ans);
        // for(int i=n-1;i>=0;i--){
        //     ans.append(list.get(i));
        // }
        System.out.println(ans.toString());
        // zzcccca
        // bbbaaaa

        // 2 pointer
        int limit =3;
        int left = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count <= limit && ans.charAt(i) == ans.charAt(left)){
                count++;
                continue;
            }else if(count > limit && ans.charAt(i) == ans.charAt(left)){
                count = 0;
                if(i+1<n){
                    char temp = ans.charAt(i);
                    ans.setCharAt(i, ans.charAt(i+1));
                    ans.setCharAt(i+1, temp);
                    left = i;
                }else{
                    count = 0;
                    ans.delete(i-1, i);
                }
            }else{
                left = i;
            }
        }

    }

    public static int count(int n){
        if(n%10==n) return 1;
        int ans =0;
        while(n>0){
            n/=10;
            ans++;
        }
        return ans;
    }

    public static int reverse(int n){
        int ans = 0;
        // int count = count(n);
        while (n>0) {
            ans = ans*10 + n%10;
            n/=10;
        }

        return ans;
    }

}
