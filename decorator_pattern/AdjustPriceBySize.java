public class AdjustPriceBySize {
    public static double adjustPrice(double cost, SizeOfBeverage size) {
        if (size == SizeOfBeverage.TALL) {
            return cost + 0.1;
        }
        else if (size == SizeOfBeverage.GRANDE) {
            return cost + 0.2;
        }
        else if (size == SizeOfBeverage.VENTI) {
            return cost + 0.3;
        }
        return cost;
    }
}
