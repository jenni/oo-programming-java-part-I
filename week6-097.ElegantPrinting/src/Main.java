
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {

        int i = 0;
        while (i < array.length) {
            if (i == array.length -1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
            i++;
        }
    }
}
