package org.skypro.skyshop.app;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Product> basketItems = new ArrayList<>();
        basketItems.add(new SimpleProduct("Яблоко", 300, false));
        basketItems.add(new FixPriceProduct("Молоко")); // фиксированная цена
        basketItems.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basketItems.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basketItems.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%

        ProductBasket basket = new ProductBasket(basketItems);
        basket.printBasket();

        SearchEngine engine = new SearchEngine(15);

        Product product1 = new SimpleProduct("Honor", 3000, false);
        Product product2 = new SimpleProduct("HyperBeast", 5000, true);
        Product product3 = new SimpleProduct("MR710", 1500, true);

        engine.add((Searchable) product1);
        engine.add((Searchable) product2);
        engine.add((Searchable) product3);

        // Добавляем статьи
        Article article1 = new Article("Телефоны", "Обзор лучших телефонов 2025");
        Article article2 = new Article("ПК", "Лучшие ПК для работы и развлечений");
        Article article3 = new Article("Периферия", "Обзор лучшей периферии ");

        engine.add(article1);
        engine.add(article2);
        engine.add(article3);

        String[] queries = {"Телефоны", "лучшие", "периферия", "HyperBeast", "Обзор"};

        for (String q : queries) {
            System.out.println("Результаты поиска по запросу: \"" + q + "\":");
            Searchable[] res = engine.search(q);
            System.out.println(Arrays.toString(res));
            System.out.println();
        }
        try {
            SimpleProduct invalidProduct1 = new SimpleProduct("", 100, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта с пустым названием: " + e.getMessage());
        }
        try {
            SimpleProduct invalidProduct2 = new SimpleProduct("   ", 150, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта с названием из пробелов: " + e.getMessage());
        }
        try {
            SimpleProduct invalidProduct3 = new SimpleProduct("Молоко", 0, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта с ценой 0: " + e.getMessage());
        }
        try {
            SimpleProduct invalidProduct4 = new SimpleProduct("Киви", -50, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании продукта с отрицательной ценой: " + e.getMessage());
        }
        try {
            DiscountedProduct invalidDiscount1 = new DiscountedProduct("Гранат", 50, -10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании скидочного продукта с отрицательным процентом скидки: " + e.getMessage());
        }
        try {
            DiscountedProduct invalidDiscount2 = new DiscountedProduct("Яблоко", 300, 150);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании скидочного продукта с процентом > 100: " + e.getMessage());
        }
    }
}