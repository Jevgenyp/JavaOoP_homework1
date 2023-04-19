package org.example1;

public class Product {
    private String name;
    private double price;
    private int rating;
    private Category category;

    public Product(String name, double price, int rating, Category category) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", category=" + category.getName() +
                '}';
    }
}
