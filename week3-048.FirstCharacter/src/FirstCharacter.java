import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String input = reader.nextLine();

        System.out.println(
                "First character: "
                + firstCharacter(input)
        );
    }

    public static char firstCharacter(String input) { return input.charAt(0); }
}
