import java.util.Scanner;
public class Pg4_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary1 = sc.nextLine();
        String binary2 = sc.nextLine();
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println(binarySum);
    }
}