import java.util.Scanner;

public class Pg5_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binaryNum = Integer.toBinaryString(num);
        System.out.println(binaryNum);
    }
}