import java.util.*;

public class Pg14_safil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> divBy3 = new ArrayList<>();
        List<Integer> divBy5 = new ArrayList<>();
        List<Integer> divByBoth = new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                divByBoth.add(i);
            }
            else if(i%3==0){
                divBy3.add(i);
            }
            else if(i%5==0){
                divBy5.add(i);
            }
        }
        System.out.println("Divisible by 3: " + divBy3);
        System.out.println("Divisible by 5: " + divBy5);
        System.out.println("Divisible by both 3 and 5: " + divByBoth);
    }
}