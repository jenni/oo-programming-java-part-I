//Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed = "";
        int textLength = text.length() -1;

        while (textLength >= 0) {
            reversed += text.charAt(textLength);
            textLength--;
        }

        return reversed.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
