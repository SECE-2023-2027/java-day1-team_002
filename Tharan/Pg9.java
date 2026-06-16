package Tharan;

import java.util.Scanner;

/*Write a Java program and compute the sum of an integer's digits. 
Input Data: Input an integer: 25 
Expected Output The sum of the digits is: 7  */

public class Pg9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dSum = 0;
        for (char digit : String.valueOf(n).toCharArray()) {
            dSum += digit - '0';
        }
        System.out.println(dSum);
        sc.close();
    }
}