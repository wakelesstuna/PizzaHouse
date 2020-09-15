import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oscar Forss
 * Date: 2020-09-10
 * Time: 16:54
 * Project: PizzaShop
 * Copyright: MIT
 * <p>
 * ***-----PIZZAHOUSE-----***<br>
 * Ths program is a pizza shop<br>
 * that ask you to logg in<br>
 * show you the menu<br>
 * ask you for selection<br>
 * then show you the receipt<br>
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Välkommen till \"PIZZAHOUSE\" vill du logga in? (Ja/Nej(skapa användare))  ");
        String input = sc.nextLine();

        // Check if the user exists and uses the right credentials
        Login.yesOrNo(input);

        // Writes the pizza menu
        System.out.println();
        System.out.println("Lägg din order");
        Menu.printMenu();

        // Creates a shopping cart
        List<Pizza> shoppingCart = ShoppingCart.shoppingCart(Menu.getPizza());

        // Writes the shopping cart and receipt
        System.out.println();
        System.out.println("***--------KVITTO-------***");
        System.out.println("***--Detta är din order--***");
        System.out.println("***-Du har beställt " + ShoppingCart.getCountPizza() + " st-***");
        for (Pizza piz : shoppingCart) {
            System.out.println(piz);
        }

        // Shows the price of the shopping cart
        System.out.printf("\nTotal pris: %14.2f \n", Calculator.cal(shoppingCart));
        System.out.println("***----VÄLKOMMEN ÅTER!----***");

    }
}
