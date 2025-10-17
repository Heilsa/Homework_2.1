package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basePrice;
    private int discountPercent;
     public DiscountedProduct(String name, int basePrice, int discountPercent) {
        super(name);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int getPriceWithDiscount() {
        return basePrice - (basePrice * discountPercent) / 100;
    }

    @Override
    public String getSearchTerm() {
        return "";
    }

    @Override
    public String getType() {
        return "DISCOUNTED_PRODUCT";
    }

    @Override
    public String toString() {
        return getType() + ": " + getName() + ", Цена: " + basePrice + ", Скидка: " + discountPercent + "%";
    }
}