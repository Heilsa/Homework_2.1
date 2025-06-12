package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final int MAX_SIZE = 5;
    private Product[] products;

    public ProductBasket() {
        this.products = new Product[MAX_SIZE];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getPrice();
            }
        }
        return total;
    }

    public void printContents() {
        boolean isEmpty = true;
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                System.out.println(p.getName() + ": " + p.getPrice());
                isEmpty = false;
                total += p.getPrice();
            }
        }
        if (isEmpty) {
            System.out.println("в корзине пусто");
        } else {
            System.out.println("Итого: " + total);
        }
    }

    public boolean containsProduct(String productName) {
        for (Product p : products) {
            if (p != null && p.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}