package app;

import java.util.Scanner;
import model.Product;
import service.Inventory;

public class Maincode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Menu menu = new Menu();

        int choice;

        do {
            menu.displayMenu();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = scanner.next();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = scanner.nextInt();

                    inventory.addProduct(new Product(name, price, qty));
                    break;

                case 2:
                    inventory.viewProducts();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}