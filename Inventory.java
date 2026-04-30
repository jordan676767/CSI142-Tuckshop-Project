package service;

import model.Product;
import model.Sale;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added!");
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p.getName() + " | Price: " + p.getPrice() + " | Qty: " + p.getQuantity());
        }
    }

    public void buyProduct(String name, int quantity, Sales sales) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {

                if (p.getQuantity() >= quantity) {
                    p.setQuantity(p.getQuantity() - quantity);

                    double total = quantity * p.getPrice();
                    sales.recordSale(new Sale(name, quantity, total));

                    System.out.println("Purchase successful!");
                } else {
                    System.out.println("Not enough stock.");
                }
                return;
            }
        }

        System.out.println("Product not found.");
    }
}
