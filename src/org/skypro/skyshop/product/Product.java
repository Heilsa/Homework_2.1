package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class Product implements Searchable {
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return "Product";
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}