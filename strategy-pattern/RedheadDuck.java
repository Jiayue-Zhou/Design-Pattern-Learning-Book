public class RedheadDuck extends Duck{
    RedheadDuck(){
        qb = new Squeak();
        fb = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a Redhead duck!");
    }
}
