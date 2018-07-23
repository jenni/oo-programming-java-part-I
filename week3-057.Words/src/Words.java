// Create a program that asks the user to input words until the user types in an empty String.
// Then the program prints the words the user gave.
// Try the for repetition sentence here.
// Use an ArrayList structure in your program.

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();


        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();

            if (input.equals("")) break;

            words.add(input);
        }

        System.out.println("You typed the following words: ");
        printValues(words);
    }

    private static void printValues(ArrayList<String> list) {
        for (String el : list) {
            System.out.println(el);
        }
    }
}
