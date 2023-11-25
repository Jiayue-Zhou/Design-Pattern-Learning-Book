public class DecoyDuck extends Duck{
    DecoyDuck() {
        qb = new Squeak();
        fb = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck!");
    }
}
