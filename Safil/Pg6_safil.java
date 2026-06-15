import java.util.Scanner;

public class Pg6_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String hexNum = Integer.toHexString(num);
        System.out.println(hexNum);
    }
}