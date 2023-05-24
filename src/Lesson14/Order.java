package Lesson14;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<ProductOrder> products;
    private double totalPrice;

    public Order() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProductOrder(ProductOrder product) {
        products.add(product);
    }

    public List<ProductOrder> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void processOrder() throws OrderProcessingException {
        try {
            for (ProductOrder product : products) {
                if (product.getCount() <= 0) {
                    throw new IllegalArgumentException("Invalid count: " + product.getCount());
                }
                if (product.getPrice() <= 0.0) {
                    throw new IllegalArgumentException("Invalid price: " + product.getPrice());
                }
                totalPrice += (product.getCount() * product.getPrice());
            }
        } catch (IllegalArgumentException e) {
            // Rethrow exception
            throw new OrderProcessingException("Error processing product order. " + e.getMessage(), e);
        }
    }
}