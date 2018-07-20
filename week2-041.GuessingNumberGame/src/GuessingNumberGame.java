
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int i = 0;

        while (true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());

            if (numberDrawn == guess) {
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + i);
            } else {
                System.out.println("The number is lesser, guesses made: " + i);
            }

            i++;
        }

        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
