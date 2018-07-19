
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.println("Type the password: ");
            String entry = reader.nextLine();

            if (entry.equals(password)) {
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            }

            System.out.println("Wrong!");
        }
    }
}
