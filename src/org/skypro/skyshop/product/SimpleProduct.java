package org.skypro.skyshop.product;

public class SimpleProduct implements Product {
    private String name;
    private int price;

    public SimpleProduct(String name, int price) {
        this.name = name;
        this.price = price;
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
        return false;
    }

    @Override
    public String toString() {
        return "Продукт: " + name + ", Цена: " + price;
    }
}