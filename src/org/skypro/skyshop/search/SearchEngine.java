package org.skypro.skyshop.search;

import org.skypro.skyshop.app.SearchableResultComparator;
import org.skypro.skyshop.product.Article;
import org.skypro.skyshop.product.Product;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchEngine {
    private Set<Product> products = new HashSet<>();
    private Set<Article> articles = new HashSet<>();

    public SearchEngine(int i) {
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public Set<Searchable> search(String query) {
        TreeSet<Searchable> result = new TreeSet<>(new SearchableResultComparator());
        String lowerQuery = query.toLowerCase();

        for (Product p : products) {
            if (p.getName().toLowerCase().contains(lowerQuery)) {
                result.add(p);
            }
        }

        for (Article a : articles) {
            if (a.getName().toLowerCase().contains(lowerQuery)) {
                result.add((Searchable) a);
            }
        }

        return result;
    }

    public void add(Searchable product1) {
    }
}