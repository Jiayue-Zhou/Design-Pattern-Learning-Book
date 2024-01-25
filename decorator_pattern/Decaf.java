public class Decaf extends Beverage {
    private double cost = 1.69;
    public Decaf(SizeOfBeverage size) {
        description = "Decaf";
        super.cost = cost;
        super.size = size;
    }
    public double cost() {
        return super.cost();
    }
}
