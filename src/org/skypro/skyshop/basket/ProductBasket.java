package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>> productsMap;

    public ProductBasket(List<Product> basketItems) {
        this.productsMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        String name = product.getName();
        productsMap.computeIfAbsent(name, k -> new ArrayList<>()).add(product);
    }

    public List<Product> removeByName(String name) {
        List<Product> removed = productsMap.remove(name);
        if (removed == null) {
            return Collections.emptyList();
        }
        return removed;
    }

    public List<Product> getProducts() {
        List<Product> allProducts = new ArrayList<>();
        for (List<Product> list : productsMap.values()) {
            allProducts.addAll(list);
        }
        return allProducts;
    }

    public void printBasket() {
        if (productsMap.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Содержимое корзины:");
            for (Map.Entry<String, List<Product>> entry : productsMap.entrySet()) {
                String name = entry.getKey();
                List<Product> list = entry.getValue();
                for (Product p : list) {
                    System.out.println(p);
                }
            }
        }
    }
}