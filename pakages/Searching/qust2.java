package Searching;
import java.util.Scanner;
public class qust2{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("tell me your name ");
            String name=sc.nextLine();
            System.out.print("Hello ");
            System.out.print(name);
        }
        System.out.print(" have a good day");
        
    }
    
}