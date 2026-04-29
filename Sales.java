package service;

import model.Sale;
import java.util.ArrayList;

public class Sales {
    private ArrayList<Sale> salesList = new ArrayList<>();

    public void recordSale(Sale sale) {
        salesList.add(sale);
    }

    public void viewSales() {
        if (salesList.isEmpty()) {
            System.out.println("No sales yet.");
            return;
        }

        for (Sale s : salesList) {
            System.out.println(s.getProductName() +
                    " x" + s.getQuantity() +
                    " = " + s.getTotalPrice());
        }
    }
}