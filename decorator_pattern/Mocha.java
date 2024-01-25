public class Mocha extends CondimentDecorator {
    private double cost = 0.99;
    private String description = "Mocha";
    private Beverage component;
    public Mocha(Beverage inner) {
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
