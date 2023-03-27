package org.example;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        product.getCategory().removeProduct(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        product.getCategory().addProduct(product);

    }

    public List<Product> getProducts() {
        return products;
    }

    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
