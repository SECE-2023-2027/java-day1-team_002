import java.util.Scanner;

public class Pg15_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        if(num1 % 10 == num2%10 || num1 % 10 == num3%10 || num2 % 10 == num3%10) {
            System.out.println("TRUE.");
        } else {
            System.out.println("FALSE.");
        }
    }
}