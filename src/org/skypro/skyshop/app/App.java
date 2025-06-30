package org.skypro.skyshop.app;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.DiscountedProduct;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Product> basketItems = new ArrayList<>();
        basketItems.add(new SimpleProduct("Яблоко", 300));
        basketItems.add(new FixPriceProduct("Молоко")); // фиксированная цена
        basketItems.add(new DiscountedProduct("Киви", 200, 25)); // скидка 25%
        basketItems.add(new FixPriceProduct("Апельсин")); // еще один фиксированный товар
        basketItems.add(new DiscountedProduct("Гранат", 50, 15)); // скидка 15%

// Создаем объект корзины и выводим содержимое
        ProductBasket basket = new ProductBasket(basketItems);
        basket.printBasket();

    }

}