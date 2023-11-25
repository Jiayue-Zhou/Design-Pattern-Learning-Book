public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performQuack();
        duck.performFly();
        duck.swim();
        duck.display();

        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
