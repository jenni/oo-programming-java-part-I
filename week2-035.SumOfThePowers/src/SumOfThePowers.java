
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int input = Integer.parseInt(reader.nextLine());
        int i = 0;
        int res = 0;

        while (i <= input) {
            res += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + res);
    }
}
