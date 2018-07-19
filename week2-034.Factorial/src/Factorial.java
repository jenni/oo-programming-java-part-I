import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int input = Integer.parseInt(reader.nextLine());
        int i = 1;
        int res = 1;
        while (i <= input) {
            res *= i;
            i++;
        }

        System.out.println("Factorial is " + res);
    }
}
