
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = 50;

        System.out.print("minutes: ");
        int m = 59;

        System.out.print("hours: ");
        int h = 23;

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0)
                minutes.next();
            if (seconds.getValue() == 0 && minutes.getValue() == 0)
                hours.next();
            i++;
        }
    }
}
