package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String getSearchTerm() {
        return title + " " + content;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getType() {
        return "ARTICLE";
    }

    @Override
    public String toString() {
        return getType() + ": " + title + " — " + content;
    }
}