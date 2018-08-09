
public class Main {

    public static void main(String[] args) {
        Multiplier threeMultiplier =  new Multiplier(3);
        Multiplier fourMultiplier =  new Multiplier(3);

        threeMultiplier.multiply(2);
        fourMultiplier.multiply(2);
        threeMultiplier.multiply(1);
        fourMultiplier.multiply(1);
    }
}
