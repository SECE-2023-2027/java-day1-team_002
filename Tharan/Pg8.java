package Tharan;

import java.util.Scanner;
/* Write a Java program to convert a binary number to a decimal number.
Input Data: Input a binary number: 100 
Expected Output Decimal Number: 4  */

public class Pg8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int n = Integer.parseInt(b, 2);
        System.out.println(n);
        sc.close();
    }
}