package Tharan;

import java.util.Scanner;
/*Write a Java program to accept a number and check whether the number is even or not. 
Prints 1 if the number is even or 0 if odd. 
Sample Output: Input a number: 20 
 1  */
public class Pg13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? 1 : 0);
        sc.close();
    }
}
