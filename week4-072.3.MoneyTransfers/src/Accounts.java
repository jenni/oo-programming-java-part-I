// Create the method public static void transfer(Account from, Account to, double howMuch) in the given program body.
// The method transfers money from one account to another.

public class Accounts {

    public static void main(String[] args) {
        Account a = new Account("A", 100.0);
        Account b = new Account("B", 0.0);
        Account c = new Account("C", 0.0);

        transfer(a, b, 50.0);
        transfer(b, c,25.0);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
