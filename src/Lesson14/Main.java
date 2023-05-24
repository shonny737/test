package Lesson14;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addProductOrder(new ProductOrder("product1", 2, 299.0));
        order.addProductOrder(new ProductOrder("product2", 0, 585.0));
        order.addProductOrder(new ProductOrder("product3", 1, -100.0));

        try {
            order.processOrder();
            System.out.println("Order processed. Total price: " + order.getTotalPrice());
        } catch (OrderProcessingException e) {
            System.out.println("Error processing order: " + e.getMessage());
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter("order.txt")) {
            for (ProductOrder product : order.getProducts()) {
                writer.println(product.getName() + "," + product.getCount() + "," + product.getPrice());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing order to file. " + e.getMessage());
        }
    }
}
