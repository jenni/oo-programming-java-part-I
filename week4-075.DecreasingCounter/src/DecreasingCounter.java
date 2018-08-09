// The constructor of DecreasingCounter receives as parameter the initial value of the counter.
//
//Exercise 75.1: Implementing method decrease()
//Implement the method decrease() so that when called, the object variable this.value is decreased by one.
//
//Exercise 75.2: Value remains positive
//Change your implementation of the method decrease() so that the value of the counter will not drop below zero.
//
//Exercise 75.3: Counter reset
//Implement the method public void reset() that sets the value of the counter to zero.
//
//Exercise 75.4: Back to initial value
//Implement the method public void setInitial(), which returns the counter to its initial value.

public class DecreasingCounter {
    private int value;
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) this.value--;
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = initialValue;
    }
}
