package org.skypro.skyshop.app;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private String title;

    public Article(String title, String content) {
        this.title = title;
    }

    @Override
    public String getSearchTerm() {
        return title;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public String toString() {
        return "Article{title='" + title + "'}";
    }
}