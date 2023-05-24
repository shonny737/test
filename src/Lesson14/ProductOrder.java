package Lesson14;

public class ProductOrder {
    private String name;
    private int count;
    private double price;

    public ProductOrder(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public boolean getName() {
        return false;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}