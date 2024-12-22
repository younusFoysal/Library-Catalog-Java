package com.library;
import java.util.Scanner;


public class LibraryCatalogApp {
    public static void main(String[] args) {
        GenericCatalog<LibraryItem> catalog = new GenericCatalog<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Catalog Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Item Details");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    LibraryItem item = new LibraryItem(title, author, itemID);
                    catalog.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter item ID to remove: ");
                    String removeID = scanner.nextLine();
                    catalog.removeItem(removeID);
                    break;

                case 3:
                    System.out.print("Enter item ID to view: ");
                    String viewID = scanner.nextLine();
                    LibraryItem viewItem = catalog.getItemDetails(viewID);
                    if (viewItem != null) {
                        System.out.println("Item Details: " + viewItem);
                    }
                    break;

                case 4:
                    catalog.displayCatalog();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
