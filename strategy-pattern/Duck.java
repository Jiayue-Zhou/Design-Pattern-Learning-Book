abstract public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    public abstract void display();
    public void performQuack() {
        qb.quack();
    }
    public void performFly() {
        fb.fly();
    }
    public void swim() {
        System.out.println("All ducks swim!");
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.qb = qb;
    }
    public void setFlyBehavior(FlyBehavior fb) {
        this.fb = fb;
    }
}
