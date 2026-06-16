package Tharan;

import java.util.Scanner;

/* Write a Java program to convert a decimal number to a hexadecimal number. 
Input Data: Input a decimal number: 15 
Expected Output Hexadecimal number is : F  */

public class Pg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String hex = Integer.toHexString(n);
        System.out.println(hex);
        sc.close();
    }
}
