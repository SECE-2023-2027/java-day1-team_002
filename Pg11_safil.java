import java.util.Scanner;

public class Pg11_safil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int spaceCnt = 0, numCnt = 0, charCnt = 0, otherCnt = 0;
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                spaceCnt++;
            } else if (Character.isDigit(c)) {
                numCnt++;
            } else if (Character.isLetter(c)) {
                charCnt++;
            } else {
                otherCnt++;
            }
        }
        System.out.println("Spaces: " + spaceCnt);
        System.out.println("Numbers: " + numCnt);
        System.out.println("Characters: " + charCnt);
        System.out.println("Others: " + otherCnt);
    }
}