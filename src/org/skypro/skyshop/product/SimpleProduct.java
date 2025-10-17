package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class SimpleProduct extends Product implements Searchable {
    private int price;
    private boolean special;

    public SimpleProduct(String name, int price, boolean special) {
        super(name);
        this.price = price;
        this.special = special;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSpecial() {
        return special;
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getType() {
        return "SIMPLE_PRODUCT";
    }

    @Override
    public String toString() {
        return getType() + ": " + getName() + ", Цена: " + price + ", Специальный: " + special;
    }
}