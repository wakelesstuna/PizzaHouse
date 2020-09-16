/**
 * Created by Oscar Forss
 * Date: 2020-09-11
 * Time: 07:37
 * Project: PizzaHouse
 * Copyright: MIT
 * <p>
 * Makes pizza with arguments id,name,price
 */
public class Pizza {
    private int id;
    private String name;
    private double price;

    public Pizza() {

    }

    /**
     * Makes a pizza
     *
     * @param id    number on menu
     * @param name  name of the pizza
     * @param price the price of the pizza
     */
    public Pizza(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    /**
     * Checks if the id number of the pizza is a positive number
     * @param id
     */
    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            throw new IllegalArgumentException("Du måste mata in ett nummer");
    }

    public String getName() {
        return name;
    }

    /**
     * Checks if the name isent empty
     * @param name
     */
    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            throw new IllegalArgumentException("Du måste mata in namn på pizzan");
    }

    public double getPrice() {
        return price;
    }

    /**
     * checks so you dont set a negative price
     * @param price
     */
    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Priset får ej vara negativt");

    }

    @Override
    public String toString() {
        return String.format("Pizza %d: %-10s %.2f", id, name, price);
    }
}

