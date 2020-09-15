import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Oscar Forss
 * Date: 2020-09-11
 * Time: 08:41
 * Project: PizzaHouse
 * Copyright: MIT
 * Checks if the user wanna logg in or not
 */
public class Login {
    /**
     * Checks if the user wanna logg in or not
     * @param input String
     */
    public static void yesOrNo(String input) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true)
            if (input.toLowerCase().equals("ja")) {
                CreateLogin.checkUser();
                break;
            } else if (input.toLowerCase().equals("nej")) {
                CreateLogin.skapaUser();
                break;
            } else {
                // if you do not input "ja" or "nej"
                System.out.println("Felaktig inmatning");
                System.out.println();
                System.out.print("Välkommen till \"PIZZAHOUSE\" vill du logga in? (Ja/Nej(skapa användare))  ");
                input = sc.nextLine();
            }

    }
}

