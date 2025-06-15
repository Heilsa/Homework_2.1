package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class FixPriceProduct extends Product {
    private static final int CONSTANT_FIX_PRICE = 200;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return CONSTANT_FIX_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " : фиксированная цена " + CONSTANT_FIX_PRICE;
    }

}
