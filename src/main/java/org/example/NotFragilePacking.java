package org.example;

import org.example.Interface.Packing;
import org.example.Product;

import java.util.List;

public class NotFragilePacking implements Packing {

    @Override
    public void packTheProducts(List<Product> shipmenList) {

        System.out.println("Товар упакован стандартно");
    }
}
