package org.skypro.skyshop.search;

import org.skypro.skyshop.BestResultNotFound;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> items;

    public SearchEngine() {
        this.items = new ArrayList<>();
    }

    public SearchEngine(int capacity) {
        this.items = new ArrayList<>(capacity);
    }

    public void add(Searchable item) {
        items.add((Searchable) item);
    }

    // Метод поиска возвращает все подходящие результаты
    public List<Searchable> search(String search) {
        List<Searchable> results = new ArrayList<>();
        if (search == null || search.isBlank()) {
            return results;
        }
        for (Searchable item : items) {
            if (item.getSearchTerm().toLowerCase().contains(search.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        if (items == null || items.isEmpty()) {
            throw new BestResultNotFound("Нет элементов для поиска по запросу: " + search);
        }
        if (search == null || search.isBlank()) {
            throw new BestResultNotFound("Пустой поисковый запрос");
        }

        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable item : items) {
            String term = item.getSearchTerm();
            int count = countOccurrences(term.toLowerCase(), search.toLowerCase());
            if (count > maxCount) {
                maxCount = count;
                bestMatch = item;
            }
        }

        if (bestMatch == null || maxCount == 0) {
            throw new BestResultNotFound("Поисковый запрос '" + search + "' не дал подходящих результатов.");
        }
        return bestMatch;
    }

    private int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        int subLength = sub.length();

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += subLength;
        }
        return count;
    }
}