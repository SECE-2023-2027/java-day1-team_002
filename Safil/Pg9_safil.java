import java.util.Scanner;

public class Pg9_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitSum = 0;
        for (char digit : String.valueOf(num).toCharArray()) {
            digitSum += digit - '0';
        }
        System.out.println(digitSum);
    }
}