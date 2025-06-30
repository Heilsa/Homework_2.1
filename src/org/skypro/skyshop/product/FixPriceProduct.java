package org.skypro.skyshop.product;

public class FixPriceProduct implements Product {
    private String name;
    private static final int FIXED_PRICE = 100; // например, 100

    public FixPriceProduct(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return false; // по желанию можно сделать true
    }

    @Override
    public String toString() {
        return "Фиксированный товар: " + name + ", Цена: " + FIXED_PRICE;
    }
}