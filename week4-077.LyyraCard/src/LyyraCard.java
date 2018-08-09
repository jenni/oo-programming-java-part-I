//The University of Helsinki students use a so-called Lyyra cards to pay for their meals in student cafeterias.
// In this assignment, we implement the class LyyraCard that simulates the Lyyra card.
//
//Exercise 77.1: Class skeleton
//Start by adding the class LyyraCard to your project.
//
//Then implement the LyyraCard constructor that gets the starting balance of the card as parameter.
// The card saves the balance in the object variable balance. Implement also the toString method that returns a string of the form "The card has X euros".
//
//Exercise 77.2: Paying with card
//Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.
//
//Exercise 77.3: Balance nonnegative
//Change methods payEconomical and payGourmet so that if there is not enought money, the balance does not change.
//
//Exercise 77.4: Loading money to card
//The method should increase the balance of the card by the given amount. However, the maximum balance on a card is 150 euros.
// In case the balance after loading money would be more than that, it should be truncated to 150 euros.
//
//Exercise 77.5: Loading a negative amount
//Change the method loadMoney so that the balance of the card does not change if the amount to load is negative.

public class LyyraCard {
    private double balanceAtStart;

    public LyyraCard(double balanceAtStart) {
        this.balanceAtStart = balanceAtStart;
    }

    public String toString() {
        return "The card has "
                + this.balanceAtStart
                + " euros";
    }

    public void payEconomical() {
        if (!(this.balanceAtStart - 2.50 < 0))
            this.balanceAtStart -= 2.50;
    }

    public void payGourmet() {
        if (!(this.balanceAtStart - 4 < 0))
            this.balanceAtStart -= 4;
    }

    public void loadMoney(double amount) {
        if (amount > 0)
            if (this.balanceAtStart + amount > 150)
                this.balanceAtStart = 150;
            else
                this.balanceAtStart += amount;
    }
}
