package Searching;
public class Recur {

    static void hello(int n){
           if (n==6){
            return ;
           }
           System.out.println(n);
           hello(n+1);
        }

    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return (n%10)+factorial(n/10);
    }   
    
    
    static int sumDig(int n){
        int x  = (n%10);
        if(n==0){
            return n;
        }
        return (x + sumDig(n/10));
    }
    
    static int revserse(int n){
        // int a = n%10;
        // System.out.println(a);
        if(n%10==n){
            return n;
        }
        return revserse(n/10);
    }
    static int palin(int n){
        
    }




    public static void main(String[] args) {
        // hello(1);
        int sum = 0;

        int ans = revserse(1342);
        System.out.println(ans);
        // System.out.println(348/10);
        // System.out.println(123%10);
        // System.out.println(123/10);

    }
}
