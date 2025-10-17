package org.skypro.skyshop.search;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {
    private List<Searchable> items;

    public SearchEngine() {
        this.items = new ArrayList<>();
    }

    public SearchEngine(List<Searchable> items) {
        this.items = new ArrayList<>(items);
    }

    public void add(Searchable item) {
        items.add(item);
    }

    public List<Searchable> getItems() {
        return items;
    }

    // Поиск
    public Set<Searchable> search(String query) {
        String lowerQuery = query.toLowerCase();
        return items.stream()
                .filter(item -> item.getSearchTerm().toLowerCase().contains(lowerQuery))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Searchable::getName))));
    }
}