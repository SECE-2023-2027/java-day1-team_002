package Tharan;

import java.util.Scanner;

/*Write a Java program to convert an integer number to a binary number. 
Input Data: Input a Decimal Number : 5 
Expected Output Binary number is: 101  */

public class Pg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        sc.close();
    }
}
