package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.search.Searchable;


import java.util.List;

public class ProductBasket implements Searchable {

    private List<Product> products;

    public ProductBasket(List<Product> products) {
        this.products = products;
    }

    public void printBasket() {
        int totalCost = 0;
        int specialCount = 0;

        for (Product product : products) {
            System.out.println(product.toString());
            totalCost += product.getPrice();
            if (product.isSpecial()) {
                specialCount++;
            }
        }
        System.out.println("Итого: " + totalCost);
        System.out.println("Специальных товаров: " + specialCount);
    }


    @Override
    public String getSearchTerm() {
        return getName(); // возвращает имя товара
    }


    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getType() {
        return "PRODUCT"; // тип - строка PRODUCT
    }
}