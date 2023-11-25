public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
        duck.swim();
        duck.display();
    }
}
