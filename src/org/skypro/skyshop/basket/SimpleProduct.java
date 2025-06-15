package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "SimpleProduct{" +
                "price=" + price +
                '}';
    }
}