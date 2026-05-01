package model;

public class Product extends Item implements Displayable {
    private int quantity;

    public Product(String name, double price, int quantity) {
        super(name, price);
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public Product(String name) {
        this(name, 0.0, 0);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity.");
            return;
        }
        this.quantity = quantity;
    }

    @Override
    public void display() {
        System.out.println(name + " | Price: " + price + " | Qty: " + quantity);
    }
}