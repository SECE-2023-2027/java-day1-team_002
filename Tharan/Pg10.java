package Tharan;

import java.util.Scanner;

/*Write a Java program to reverse a string. Input Data: 
Input a string: The quick brown fox 
Expected Output Reverse string: xof nworb kciuq ehT  */

public class Pg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(new StringBuilder(s).reverse().toString());
        sc.close();
    }
}

