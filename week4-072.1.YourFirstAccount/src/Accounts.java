
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAccount = new Account("Jen", 100.0);
        myAccount.deposit(20.0);
        System.out.println(myAccount);
    }

}
