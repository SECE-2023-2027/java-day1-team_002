package Tharan;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.In digital electronics and mathematics, 
a binary number is a number expressed in the base-2 numeral system or binary numeral system. 
This system uses only two symbols: typically 1 (one) and 0 (zero). 
Input first binary number: 100010
Input second binary number: 110010
Sum of two binary numbers: 1010100  */

public class Pg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b1 = sc.nextLine();
        String b2 = sc.nextLine();
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);
        int sum = n1 + n2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println(binarySum);
        sc.close();
    }
}