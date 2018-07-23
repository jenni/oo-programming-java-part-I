// Create a program that asks the user to input words until the user gives the same word twice.
// Use an ArrayList structure in your program.
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        String duplicate;

        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();

            if (words.contains(input)) {
                duplicate = input;
                break;
            }

            words.add(input);
        }

        System.out.println(
                "You gave the word "
                + duplicate
                + " twice"
        );
    }

}
