package Tharan;

import java.util.Scanner;
/*Write a Java program that accepts three integers from the user and returns true 
if two or more of them (integers) have the same rightmost digit. 
The integers are non-negative. 
Sample Output: 
Input the first number : 5 
Input the second number: 10 
Input the third number : 15 
The result is: true  */
public class Pg15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();
        
        if(n1 % 10 == n2%10 || n1 % 10 == n3%10 || n2 % 10 == n3%10) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
        sc.close();
    }
}
