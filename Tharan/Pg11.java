package Tharan;

import java.util.Scanner;

/*Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output 
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 
letter: 23 
space: 9
number: 10 
other : 6 */

public class Pg11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int spc = 0, nc = 0, cc = 0, oc = 0;
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spc++;
            } else if (Character.isDigit(c)) {
                nc++;
            } else if (Character.isLetter(c)) {
                cc++;
            } else {
                oc++;
            }
        }
        System.out.println("Spaces: " + spc);
        System.out.println("Numbers: " + nc);
        System.out.println("Characters: " + cc);
        System.out.println("Others: " + oc);
        sc.close();
    }
}