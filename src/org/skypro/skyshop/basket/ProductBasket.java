package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductBasket {
    private Map<String, List<Product>> productsMap;

    public ProductBasket(List<Product> basketItems) {
        this.productsMap = new HashMap<>();
        basketItems.forEach(this::addProduct);
    }

    public void addProduct(Product product) {
        String name = product.getName();
        productsMap.computeIfAbsent(name, k -> new ArrayList<>()).add(product);
    }

    public List<Product> removeByName(String name) {
        List<Product> removed = productsMap.remove(name);
        return removed != null ? removed : Collections.emptyList();
    }

    public List<Product> getProducts() {
        return productsMap.values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public void printBasket() {
        if (productsMap.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Содержимое корзины:");
            productsMap.values()
                    .stream()
                    .flatMap(Collection::stream)
                    .forEach(System.out::println);
            System.out.println("Количество специальных продуктов: " + getSpecialCount());
        }
    }

    private long getSpecialCount() {
        return productsMap.values()
                .stream()
                .flatMap(Collection::stream)
                .filter(Product:: isSpecial)
                .count();
    }
}