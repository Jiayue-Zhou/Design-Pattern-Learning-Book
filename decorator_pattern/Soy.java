public class Soy extends CondimentDecorator {
    private double cost = 0.29;
    private String description = "Soy";
    private Beverage component;
    public Soy(Beverage inner) {
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
