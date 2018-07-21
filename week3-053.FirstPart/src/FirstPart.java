// Create a program that prints the first part of a word.
// The program asks the user for the word and the length of the first part.
// Use the substring method in your program.

import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String input = reader.nextLine();

        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println(
                "Result: " + input.substring(0, length)
        );
    }
}
