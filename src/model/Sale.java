package model;

public class Sale implements Displayable {
    private String productName;
    private int quantity;
    private double totalPrice;

    public Sale(String productName, int quantity, double totalPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public void display() {
        System.out.println(productName + " x" + quantity + " = " + totalPrice);
    }
}