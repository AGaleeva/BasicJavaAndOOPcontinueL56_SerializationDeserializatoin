package homework56;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private int amount;
    private transient double discount;

    public Product(String name, double price, int amount, double discount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", " + price + " Eur., " + amount + " pcs.";
    }
}
