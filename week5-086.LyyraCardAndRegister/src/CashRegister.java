
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    private static final double PRICE1 = 2.50;
    private static final double PRICE2 = 4.00;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= PRICE1) {
            this.cashInRegister += PRICE1;
            this.economicalSold++;
            return cashGiven - PRICE1;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= PRICE1) {
            card.pay(PRICE1);
            this.economicalSold++;
            return true;
        }

        return false;
    }


    public double payGourmet(double cashGiven) {
        if (cashGiven >= PRICE2) {
            this.cashInRegister += PRICE2;
            this.gourmetSold++;
            return cashGiven - PRICE2;
        }
        return cashGiven;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= PRICE2) {
            card.pay(PRICE2);
            this.gourmetSold++;
            return true;
        }

        return false;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
}
