import java.util.Scanner;

public class Pg7_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String octalNum = Integer.toOctalString(num);
        System.out.println(octalNum);
    }
}