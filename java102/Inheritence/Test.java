package Inheritence;

import java.util.ArrayList;

public class Test {
    LibraryItem[] items = new LibraryItem[] {
        new Book("2020", "P00O", "Cool Generic Author", 120),
        new Book("Cool book", "P00L", "Uncool Author", 102),
        new DVD("0202", "B00P", 120.0),
        new DVD("Cool movie", "B00M", 180.0)
    };
    
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
    
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> allAvailable = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.available()) {
                allAvailable.add(item);
            }
        }
        return allAvailable;
    }

}
