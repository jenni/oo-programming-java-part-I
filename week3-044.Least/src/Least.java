
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        int least = number1 < number2 ? number1 : number2;
        return least;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
