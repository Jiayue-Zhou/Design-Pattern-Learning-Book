public class RubberDuck extends Duck {
    RubberDuck() {
        qb = new MuteQuack();
        fb = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am a rubber duck!");
    }
}
