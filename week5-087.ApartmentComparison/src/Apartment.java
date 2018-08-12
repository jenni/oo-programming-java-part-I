
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment apartment) {
        if (this.squareMeters > apartment.squareMeters) return true;
        return false;
    }

    public int priceDifference(Apartment apartment) {
        return Math.abs(this.totalPrice() - apartment.totalPrice());
    }

    public boolean moreExpensiveThan(Apartment apartment) {
        if (this.totalPrice() > apartment.totalPrice()) return true;
        return false;
    }

    private int totalPrice() {
        return this.pricePerSquareMeter * this.squareMeters;
    }
}
