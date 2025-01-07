package Linkedlist;

import java.util.HashSet;

public class LLCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashSet<Integer> hs = new HashSet<Integer>();
        while(temp!=null){
            if (hs.contains(temp.val)) {
                return temp;
            }else{
                hs.add(temp.val);
            }
            temp=temp.next;
        }
        return null;
    }

    public static int GCD(int num1,int num2){
        // int num;
        // if (num1>num2) {
        //     num=num2;
        // }else{
        //     num=num1;
        // }

        // for(int i=num;i>0;i--){
        //     if(num1%i==0 && num2%i==0){
        //         return i;
        //     }
        // }
        int rem = 0;
        while (num1%num2!=0) {
            rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        return rem;
    }

    public static int LCM(int num1,int num2){
        // int num;
        // int lar;
        // if(num1<num2){
        //     num=num1;
        //     lar=num2;
        // }else{
        //     num=num2;
        //     lar=num1;
        // }
        // for(int i=1;i<=10;i++){
        //     int n = num*i;
        //     if(n%lar==0){
        //         return n;
        //     }
        // }

        return (num1*num2)/GCD(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println(GCD(36, 24));
        System.out.println(LCM(36,24));
    }
}
