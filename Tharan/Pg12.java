package Tharan;

import java.util.Scanner;

/*Write a Java program to print the ASCII value of a given character.
Expected Output The ASCII value of Z is :90  */

public class Pg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("The ASCII value of " + ch + " is: " + (int) ch);
        sc.close();
    }
}