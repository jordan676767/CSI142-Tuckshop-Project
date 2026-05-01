package app;

import java.util.Scanner;
import model.Product;
import service.Inventory;
import service.Sales;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Sales sales = new Sales();
        Menu menu = new Menu();

        int choice = -1;

        do {
            menu.displayMenu();
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter product name: ");
                        String name = scanner.next();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter quantity: ");
                        int qty = scanner.nextInt();

                        inventory.addProduct(new Product(name, price, qty));
                        break;

                    case 2:
                        inventory.viewProducts();
                        break;

                    case 3:
                        System.out.print("Enter product name: ");
                        String buyName = scanner.next();
                        System.out.print("Enter quantity: ");
                        int buyQty = scanner.nextInt();

                        inventory.buyProduct(buyName, buyQty, sales);
                        break;

                    case 4:
                        sales.viewSales();
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
                scanner.nextLine(); 
            }

        } while (choice != 0);

        scanner.close();
    }
}