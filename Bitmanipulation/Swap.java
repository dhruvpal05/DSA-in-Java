package Bitmanipulation;

public class Swap {
    public static void swaptwonum(int num1, int num2) {
        num1 = num1 ^ num2; // (num1 ^ num2)
        num2 = num1 ^ num2; // (num1 ^ num2) ^ num2 = num1 # num2 gets canceled now num2 = num1
        num1 = num1 ^ num2; // (num1 ^ num2) ^ num1 = num2 # num1 gets canceled now num1 = num2
    }

    
}
