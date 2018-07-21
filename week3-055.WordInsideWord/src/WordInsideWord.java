// Create a program that asks the user for two words.
// Then the program tells if the second word is included in the first word.
// Use String method indexOf in your program.

import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word: ");
        String firstWord = reader.nextLine();

        System.out.println("Type the second word: ");
        String secondWord = reader.nextLine();

        int secondWordIndex = firstWord.indexOf(secondWord);

        if (secondWordIndex != -1) {
            System.out.println(
                    "The word "
                    + secondWord
                    + " is found in the word "
                    + firstWord
            );
        } else {
            System.out.println(
                    "The word "
                    + secondWord
                    + " is not found in the word "
                    + firstWord
            );
        }
    }
}
