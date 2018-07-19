
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int min = Integer.parseInt(reader.nextLine());
        int max = Integer.parseInt(reader.nextLine());

        while (min <= max) {
            System.out.println(min);

            if (min > max) {
                continue;
            }
//            min = min + 1;
            min++;
        }

    }
}
