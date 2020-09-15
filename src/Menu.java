/**
 * Created by Oscar Forss
 * Date: 2020-09-11
 * Time: 09:29
 * Project: PizzaHouse
 * Copyright: MIT
 * <p>
 * Makes pizza puts them into an array
 * Makes a menu of pizza
 */
public class Menu {
    private static Pizza[] pizza = pizza();
    /**
     * Makes a menu of pizza
     */
    public static void printMenu() {
        System.out.print("----------------Menu----------------");
        System.out.printf("\nPizza %d: %-20s %-5.2f", pizza[0].getId(), pizza[0].getName(), pizza[0].getPrice());
        System.out.printf("\nPizza %d: %-20s %-5.2f", pizza[1].getId(), pizza[1].getName(), pizza[1].getPrice());
        System.out.printf("\nPizza %d: %-20s %-5.2f", pizza[2].getId(), pizza[2].getName(), pizza[2].getPrice());
        System.out.println();
    }

    public static void setPizza(Pizza[] pizza) {
        Menu.pizza = pizza;
    }

    public static Pizza[] getPizza() {
        return pizza;
    }

    /**
     * Makes pizzas and puts them in an array
     * @return array of pizzas
     */
    public static Pizza[] pizza() {
        Pizza[] pizzas = new Pizza[3];
        // Visuvio
        pizzas[0] = new Pizza(1, "Visuvio", 85);
        // Calzone
        pizzas[1] = new Pizza(2, "Calzone", 95);
        // Hawaii
        pizzas[2] = new Pizza(3, "Hawaii", 100);

        return pizzas;
    }
}
