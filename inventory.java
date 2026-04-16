package service;

import model.Product;
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
            System.out.println(
                p.getName() +
                " | Price: P" + p.getPrice() +
                " | Qty: " + p.getQuantity()
            );
        }
    }
}