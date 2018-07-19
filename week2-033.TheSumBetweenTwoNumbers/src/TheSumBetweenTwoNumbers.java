
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int lower = Integer.parseInt(reader.nextLine());
        int upper = Integer.parseInt(reader.nextLine());

        int res = 0;

        while (lower <= upper) {
            res += lower;
            lower++;
        }

        System.out.println("The sum is " + res);
    }
}
