public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;

        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;

        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int stars = 0;
        int spaces = size -1;

        while (i <= size) {
            printWhitespaces(spaces--);
            printStars(stars += 1);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int stars = 0;
        int spaces = height -1;
        int max = height * 2;
        int width = max -1;

        while (i <= max) {

            if (width == stars) {
                int center = (max / 2) - 2;
                printWhitespaces(center);
                printStars(3);
                printWhitespaces(center);
                printStars(3);
            }

            stars ++;

            if (stars % 2 != 0) {
                printWhitespaces(spaces--);
                printStars(stars);
            }

            i++;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printStars(2);
        printWhitespaces(2);
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}