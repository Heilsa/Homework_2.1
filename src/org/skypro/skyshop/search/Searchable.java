package org.skypro.skyshop.search;

public interface Searchable {

    // Метод получения search term
    String getSearchTerm();

    // Метод получения типа контента
    String getType();

    // Метод получения имени объекта
    String getName();

    // Метод преобразования в строку (по условию)
    default String getStringRepresentation() {
        return getName() + " — тип " + getType();
    }
}