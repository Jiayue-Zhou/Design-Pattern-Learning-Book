public class Espresso extends Beverage {
    private double cost = 1.39;
    public Espresso(SizeOfBeverage size) {
        description = "Espresso";
        super.cost = cost;
        super.size = size;
    }
    public double cost() {
        return super.cost();
    }
}
