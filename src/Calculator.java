import java.util.List;

/**
 * Counts the price of the shopping cart
 */
public class Calculator {
    private static double newPrice;

    /**
     * Counts the price of the shopping cart
     *
     * @param list shopping cart
     * @return price of shopping cart
     */
    public static double cal(List<Pizza> list) {
        for (Pizza pizza : list) {
            double price = pizza.getPrice();
            newPrice += price;
        }
        return newPrice;
    }
}
