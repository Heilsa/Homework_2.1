package org.skypro.skyshop.product;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private double price;

    public SimpleProduct(String name, double price) {
        super(name);
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше 0");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}