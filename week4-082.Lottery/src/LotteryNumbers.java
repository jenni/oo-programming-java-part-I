import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private final Random random = new Random();

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        int i = 0;

        while (i < 7) {
            int n = random.nextInt(39) + 1;

            if (containsNumber(n)) continue;
            this.numbers.add(n);
            i++;
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
