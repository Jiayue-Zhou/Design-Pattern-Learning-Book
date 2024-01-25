import javax.management.MBeanNotificationInfo;

public class Whip extends CondimentDecorator {
    private double cost = 0.79;
    private String description = "Whip";
    private Beverage component;
    public Whip(Beverage inner) {
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
