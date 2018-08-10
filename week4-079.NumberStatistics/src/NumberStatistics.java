
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers;
        this.sum = sum;
    }

    public void addNumber(final int number) {
        this.amountOfNumbers ++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double average = 0;
        if (this.amountOfNumbers != 0)
            average = (double) this.sum / (double) this.amountOfNumbers;

        return average;
    }
}
