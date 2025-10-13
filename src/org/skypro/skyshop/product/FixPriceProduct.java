package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 100;

    public FixPriceProduct(String name) {
        super(name);
    }

    public   double getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getType() {
        return "FIX_PRICE_PRODUCT";
    }

    @Override
    public String toString() {
        return getType() + ": " + getName() + ", Цена: " + FIXED_PRICE;
    }
}