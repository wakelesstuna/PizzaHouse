import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Oscar Forss
 * Date: 2020-09-14
 * Time: 17:37
 * Project: PizzaHouse
 * Copyright: MIT
 * <p>
 * Creates a user or checks if the user are in the "database.txt"
 */

public class CreateLogin  {
    private static final String filename = "database.txt";
    /**
     * Creates a user and puts them in to the "database.txt"
     * @throws IOException
     */
    public static void skapaUser() throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Skapa användare");
            System.out.print("Mata in användarnamn: ");
            String userName = sc.nextLine();
            System.out.print("Mata in lösenord: ");
            String passWord = sc.nextLine();

            if (userName == null || passWord == null) {
                System.out.println("Du har inte matat in användarnamn eller lösenord");
                continue;
            }
            PrintWriter writeToFile = new PrintWriter((new BufferedWriter(new FileWriter(filename, true))));
            writeToFile.println(userName);
            writeToFile.println(passWord);
            writeToFile.close();
            break;
        }
        System.out.println("Användare skapad");

        checkUser();
    }

    /**
     * Reads "database.txt" and creates an Array of users with
     * username and passwords
     * @throws NoSuchElementException
     * @throws IOException
     */
    public static CreateUser[] putUserInArray(String filename) throws NoSuchElementException,  IOException {
        // läs file
        Scanner sc = new Scanner(new File(filename));
        CreateUser[] users = new CreateUser[100];
        int n = 0;
        while (sc.hasNext()) {
            users[n] = new CreateUser();
            users[n].setUserName(sc.next());
            users[n].setPassWord(sc.next());
            n++;
        }
        return users;
    }

    /**
     * Check the users input against the "database.txt" to se if the user exsists
     *
     * @throws IOException
     */
    public static void checkUser() throws IOException {
        Scanner sc = new Scanner(System.in);
        CreateUser[] users = putUserInArray(filename);
        boolean test = true;
        while (test) {
            System.out.println("Logga in");
            System.out.println("Användarnamn: ");
            String name = sc.nextLine();
            System.out.println("lösenord: ");
            String pass = sc.nextLine();
            if (name == null || pass == null)
                break;
            try {
                for (CreateUser user : users) {
                    if (user.getUserName().equals(name) && user.getPassWord().equals(pass)) {
                        System.out.println("Välkommen " + user.getUserName());
                        test = false;
                        break;
                    }
                }
            } catch (NullPointerException e) {
                System.out.println("Finns ingen användare med de användarnamn och lösenord \nFörsök igen");
            }
        }
    }

}
