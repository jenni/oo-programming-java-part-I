
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String name2 = reader.nextLine();

        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        System.out.println(
                name
                + " and "
                + name2
                + " are "
                + (age + age2)
                + " years old in total."
        );
    }
}
