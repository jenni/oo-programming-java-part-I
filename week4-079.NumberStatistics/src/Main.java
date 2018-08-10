import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats1 = new NumberStatistics();
        NumberStatistics stats2 = new NumberStatistics();
        NumberStatistics stats3 = new NumberStatistics();

        System.out.println("Type numbers:");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());

            if (input == -1) break;

            stats1.addNumber(input);

            if (input % 2 == 0)
                stats2.addNumber(input);
            else
                stats3.addNumber(input);
        }

        System.out.println("sum: " + stats1.sum());
        System.out.println("sum of even: " + stats2.sum());
        System.out.println("sum of odd: " + stats3.sum());
    }
}
