
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String input = reader.nextLine();

        int i = 0;
        int num = 1;
        while (i < input.length()) {
            System.out.println(
                    (num++) + ". character: " + input.charAt(i)
            );

            i++;
        }
    }
}
