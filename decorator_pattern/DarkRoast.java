public class DarkRoast extends Beverage {
    private double cost = 1.29;
    public DarkRoast(SizeOfBeverage size) {
        description = "Dark Roast";
        super.cost = cost;
        super.size = size;
    }
    public double cost() {
        return super.cost();
    }
}
