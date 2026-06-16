package Tharan;

import java.util.Scanner;

//Write a Java program to print the area and perimeter of a circle.

public class Pg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        double circum = 2 * Math.PI * r;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circum);
        sc.close();
    }
}