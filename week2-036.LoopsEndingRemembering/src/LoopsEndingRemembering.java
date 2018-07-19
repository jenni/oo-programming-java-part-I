import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int input = 0;
        int sum = 0;
        int countInputTimes = -1;
        double average;
        int even = 0;
        int odd = -1;

        while (input != -1) {
            System.out.println("Type numbers: ");
            sum += input;
            input = Integer.parseInt(reader.nextLine());
            countInputTimes += 1;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        average = (double) sum / countInputTimes;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers " + countInputTimes);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
