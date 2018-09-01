
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(
                added.euros + this.euros,
                added.cents + this.cents
        );
    }

    public boolean less(Money compared) {
        int thisTotal = this.euros * 100 + this.cents;
        int comparedTotal = compared.euros() * 100 + compared.cents();

        return (thisTotal < comparedTotal);
    }

    public Money minus(Money decremented) {
        Money total;

        if (this.less(decremented)) {
            total = new Money(0, 0);
        } else {
            int decrementedEuros = this.euros() - decremented.euros();
            int decrementedCents = this.cents() - decremented.cents();

            if (decrementedCents < 0) {
                decrementedEuros--;
                decrementedCents += 100;
            }
            total = new Money(
                    decrementedEuros,
                    decrementedCents
            );
        }

        return total;
    }


    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
