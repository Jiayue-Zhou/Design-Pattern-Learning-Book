public class MallardDuck extends Duck{
    MallardDuck() {
        qb = new Quack();
        fb = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard!");
    }
}
