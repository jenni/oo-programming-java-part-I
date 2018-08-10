import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        int i = 0;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String password = "";

        while (i < this.length) {
            password += abc.charAt(random.nextInt(abc.length()));
            i++;
        }

        return password;
    }
}
