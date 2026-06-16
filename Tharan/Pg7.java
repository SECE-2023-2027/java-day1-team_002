package Tharan;

import java.util.Scanner;

/* Write a Java program to convert a decimal number to an octal number.
Input Data: Input a Decimal Number: 15 
Expected Output Octal number is: 17   */

public class Pg7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String octal = Integer.toOctalString(n);
        System.out.println(octal);
        sc.close();
    }
}
