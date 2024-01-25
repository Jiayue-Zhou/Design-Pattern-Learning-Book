public class HouseBlend extends Beverage {
    private double cost = 1.99;
    public HouseBlend(SizeOfBeverage size) {
        description = "HouseBlend";
        super.cost = cost;
        super.size = size;
    }
    public double cost() {
        return super.cost();
    }
}
