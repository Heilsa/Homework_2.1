package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class SimpleProduct implements Product, Searchable {
    private String name;
    private int price;
    private boolean isSpecial;

    public SimpleProduct(String name, int price, boolean isSpecial) {
        this.name = name;
        this.price = price;
        this.isSpecial = isSpecial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return isSpecial;
    }

    // Методы Searchable
    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getType() {
        return "PRODUCT";
    }
}