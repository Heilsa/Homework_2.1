package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    private int basicPrice;
    private int discountedPrice;

    public DiscountedProduct(String name, int basicPrice, int discountedPrice) {
        super(name);
        this.basicPrice = basicPrice;
        this.discountedPrice = discountedPrice;
    }

    @Override
    public int getPrice() {
        return basicPrice - (basicPrice * discountedPrice / 100);
    }

    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discountedPrice + "%)";
    }
}

