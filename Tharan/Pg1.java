package Tharan;

//Write a Java program to print 'Hello' on the screen and your name on a separate line.

import java.util.*;

public class Pg1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
