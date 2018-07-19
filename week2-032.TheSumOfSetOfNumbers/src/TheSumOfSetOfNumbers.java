
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
        int i = 1;
        int res = 0;

        while (i <= n) {
            res += i;
            i++;
        }

        System.out.println("Sum is: " + res);
    }
}
