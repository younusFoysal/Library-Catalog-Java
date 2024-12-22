package com.library;
import java.util.HashMap;
import java.util.Map;


public class GenericCatalog<T extends LibraryItem> {
    private Map<String, T> catalog;

    public GenericCatalog() {
        this.catalog = new HashMap<>();
    }

    public void addItem(T item) {
        catalog.put(item.getItemID(), item);
        System.out.println("Item added: " + item);
    }

    public void removeItem(String itemID) {
        if (catalog.containsKey(itemID)) {
            T removedItem = catalog.remove(itemID);
            System.out.println("Item removed: " + removedItem);
        } else {
            System.out.println("Error: Item with ID " + itemID + " not found.");
        }
    }

    public T getItemDetails(String itemID) {
        T item = catalog.get(itemID);
        if (item != null) {
            return item;
        } else {
            System.out.println("Error: Item with ID " + itemID + " not found.");
            return null;
        }
    }

    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty.");
        } else {
            System.out.println("Catalog Contents:");
            for (T item : catalog.values()) {
                System.out.println(item);
            }
        }
    }
}
