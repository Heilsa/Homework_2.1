package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.Searchable;

import java.util.List;
import java.util.stream.Collectors;

public class ProductBasket implements Searchable {

    private List<Product> products;

    public ProductBasket(List<Product> products) {
        this.products = products;
    }

    public void printBasket() {
        int totalCost = 0;
        int specialCount = 0;

        for (Product product : products) {
            System.out.println(product);

            if (product instanceof org.skypro.skyshop.product.SimpleProduct simpleProduct) {
                totalCost += simpleProduct.getPrice();
                if (simpleProduct.isSpecial()) {
                    specialCount++;
                }
            } else if (product instanceof org.skypro.skyshop.product.DiscountedProduct discountedProduct) {
                totalCost += discountedProduct.getPriceWithDiscount();
            } else if (product instanceof org.skypro.skyshop.product.FixPriceProduct fixPriceProduct) {
                totalCost += fixPriceProduct.getPrice();
            }
        }
        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }

    @Override
    public String getSearchTerm() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(" "));
    }

    @Override
    public String getName() {
        return "Корзина товаров";
    }

    @Override
    public String getType() {
        return "PRODUCT_BASKET";
    }
}