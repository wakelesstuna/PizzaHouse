import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oscar Forss
 * Date: 2020-09-14
 * Time: 15:13
 * Project: PizzaHouse
 * Copyright: MIT
 *
 * Makes a shoppingcart of pizza
 */
public class ShoppingCart {
    private static int countPizza;
    private static String input;
    private static double totalPrice;

    /**
     * Makes a List of pizzas after the users commands
     *
     * @param array Array of pizzas
     * @return list shoppingCart of the users chose of pizzas from the array[]
     */
    public static List<Pizza> shoppingCart(Pizza[] array) {
        Scanner sc = new Scanner(System.in);
        List<Pizza> shoppingCart = new ArrayList<>();
        setPrice(countPizza);
        System.out.println("Välj en pizza (1,2,3): ");
        String pizzaId = sc.next();
        while (true) {
            switch (pizzaId) {
                case "1" -> shoppingCart.add(array[0]);
                case "2" -> shoppingCart.add(array[1]);
                case "3" -> shoppingCart.add(array[2]);
                default -> {
                    System.out.println("Du måste mata in ett tal mellan 1-3");
                    countPizza--;
                }
            }
            countPizza++;
            System.out.println("Vill du lägga till en pizza till? \"nej\", för att skicka order \nVälj en pizza (1,2,3): ");
            input = sc.next();
            if (input.toLowerCase().equals("nej")) {
                System.out.println("Din order skickas...");
                break;
            } else
                pizzaId = input;
        }
        return shoppingCart;
    }

    public static int getCountPizza() {
        return countPizza;
    }

    public static void setCountPizza(int countPizza) {
        ShoppingCart.countPizza = countPizza;
    }

    public double getPrice() {
        return totalPrice;
    }

    public static void setPrice(double price) {
        ShoppingCart.totalPrice = price;
    }

    public static String getInput() {
        return input;
    }

    public static void setInput(String input) {
        ShoppingCart.input = input;
    }
}



