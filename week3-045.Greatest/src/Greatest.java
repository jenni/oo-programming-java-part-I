import java.util.List;
import java.util.Optional;

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        return (number1 > number2 && number1 > number3) ? number1 :
                ( number2 > number1 && number2 > number3 ) ? number2 : number3;


    }

    public static void main(String[] args) {
        int result = greatest(-5, -8, -4);
        System.out.println("Greatest: " + result);
    }
}
