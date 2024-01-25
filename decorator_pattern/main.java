public class main {
    public static void main(String[] args) {
        Beverage coffee = new Decaf(SizeOfBeverage.VENTI);
        coffee = new Milk(coffee);
        coffee = new Soy(coffee);
        coffee = new Soy(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}
