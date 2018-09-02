import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.height = height;
        this.width = width;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }

        System.out.println(starsInLastPrint);
    }

    public void print() {
        starsInLastPrint = 0;

        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println(" ");
        }
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
