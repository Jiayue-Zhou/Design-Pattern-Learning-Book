public class Milk extends CondimentDecorator {
    private double cost = 0.39;
    private String description = "Milk";
    private Beverage component;
    public Milk(Beverage inner) {
        component = inner;
    }
    @Override
    public String getDescription() {
        return component.getDescription() + " + " + description;
    }

    @Override
    public double cost() {
        return component.cost() + cost;
    }
}
