package Arrays;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("working");
        System.out.print("enter 1st number :");
        try (Scanner s = new Scanner(System.in)) {
            int a=s.nextInt();
            //System.out.println(a);
            System.out.print("enter 2nd number :");
            int b=s.nextInt();
            //System.out.println(b);
            int sum=a+b;
            System.out.print("sum of the two number is: ");
            System.out.println(sum);
        }


    }
    
}
