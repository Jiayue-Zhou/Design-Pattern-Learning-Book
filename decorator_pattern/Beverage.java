public abstract class Beverage {
    protected String description;
    protected SizeOfBeverage size;
    protected double cost;
    public String getDescription() {
        return size + " " + description;
    }
    public double cost() {
        System.out.println("In Beverage, cost is " +  this.cost + " size is " + this.size);
        return AdjustPriceBySize.adjustPrice(cost, size);
    }
}
