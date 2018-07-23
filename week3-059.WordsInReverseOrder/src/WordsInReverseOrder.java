//Create a program that asks the user to input words, until the user gives an empty string.
// Then the program prints the words the user gave in reversed order, the last word is printed first etc.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();

            if (input.equals("")) break;

            arr.add(input);
        }

        int i = arr.size() - 1;

        while (i >= 0) {
            System.out.println(
                    arr.get(i)
            );
            i--;
        }
    }
}
