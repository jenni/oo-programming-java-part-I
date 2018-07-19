
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type the radius: ");
        double radius = Integer.parseInt(reader.nextLine());

        System.out.println(
                "Circumference of the circle: "
                + 2 * Math.PI * radius
        );
    }
}
