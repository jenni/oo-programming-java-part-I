// Create the method reverse that puts the given string in reversed order.

import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = 0;
        int reducer = text.length();
        String res = "";

        while (i < text.length()) {

            System.out.print(
                    res += text.charAt(reducer -= 1)
            );

            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
