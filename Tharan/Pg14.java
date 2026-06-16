package Tharan;

import java.util.*;

/*Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both. 
Sample Output: 
Divided by 3: 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57,
60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
Divided by 5: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95,                                                                                                                                             
Divided by 3 & 5: 15, 30, 45, 60, 75, 90,  */

public class Pg14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> d3 = new ArrayList<>();
        List<Integer> d5 = new ArrayList<>();
        List<Integer> dall = new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                dall.add(i);
            }
            else if(i%3==0){
                d3.add(i);
            }
            else if(i%5==0){
                d5.add(i);
            }
        }
        System.out.println("Divisible by 3: " + d3);
        System.out.println("Divisible by 5: " + d5);
        System.out.println("Divisible by both 3 and 5: " + dall);
        sc.close();
    }
}