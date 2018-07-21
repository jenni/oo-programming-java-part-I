import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String input = reader.nextLine();

        System.out.print("In reverse order: ");

        int i = 0;
        int reducer = input.length();

        while (i < input.length()) {

            System.out.print(
                    input.charAt(reducer -= 1)
            );

            i++;
        }
    }
}
