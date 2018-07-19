
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String username = reader.nextLine();
        String password = reader.nextLine();

        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else if (username.equals("emily") && password.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
