package Searching;
import java.util.Scanner;
public class  percentage{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter marks of eng:");
            int eng=s.nextInt();
            System.out.print("enter marks of math:");
            int math=s.nextInt();
            System.out.print("enter marks of science:");
            int sci =s.nextInt();
            System.out.print("enter marks of hindi:");
            int hindi=s.nextInt();
            System.out.print("enter marks of social science:");
            int sst=s.nextInt();
            int tmarks=eng+math+sci+hindi+sst;
            System.out.print("total marks out of 500 are: ");
            System.out.println(tmarks);
            double pent=tmarks/5;
            System.out.print("your percentage is: ");
            System.out.println(pent);
        }
    }

}    