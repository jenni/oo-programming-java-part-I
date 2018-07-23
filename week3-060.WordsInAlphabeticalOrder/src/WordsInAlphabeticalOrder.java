
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();

        while (true) {
            String word = reader.nextLine();

            if (word.equals("")) break;

            arr.add(word);
        }

        Collections.sort(arr);

        for (String a : arr) System.out.println(a);
    }
}
