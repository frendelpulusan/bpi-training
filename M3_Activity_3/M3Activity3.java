package ph.com.bpi.hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M3Activity3 {

    // Renamed variables
    private static final Map<String, Integer> itemPriceMap = new HashMap<>();
    private static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        // Seed data
        itemPriceMap.put("Laptop", 50000);
        itemPriceMap.put("Monitor", 7000);
        itemPriceMap.put("Mouse", 500);
        itemPriceMap.put("Keyboard", 1000);
        itemPriceMap.put("Printer", 6000);

        boolean active = true;
        while (active) {
            showOptions();
            System.out.print("> ");
            String action = console.nextLine().trim();

            switch (action) {
                case "1":
                    findItem();
                    break;
                case "2":
                    addItem();
                    break;
                case "3":
                    displayCatalog();
                    break;
                case "4":
                    showLowestPricedItem();
                    break;
                case "5":
                    System.out.println("Closing application... Thank you!");
                    active = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please choose 1, 2, 3, 4, or 5.");
            }
            System.out.println();
        }
    }

    // Renamed label/menu
    private static void showOptions() {
        System.out.println("=== Product Catalog Menu ===");
        System.out.println("1. Look up item by name");
        System.out.println("2. Add item with price");
        System.out.println("3. Show all items and prices");
        System.out.println("4. Show cheapest item");
        System.out.println("5. Exit");
    }

    // Renamed method: searchProduct -> findItem
    private static void findItem() {
        System.out.print("Enter item name to search: ");
        String nameQuery = console.nextLine().trim();

        // Case-insensitive lookup
        Integer price = null;
        for (Map.Entry<String, Integer> entry : itemPriceMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(nameQuery)) {
                price = entry.getValue();
                break;
            }
        }

        if (price != null) {
            System.out.println("Item found! Price: " + price);
        } else {
            System.out.println("Item not found.");
        }
    }

    // Renamed method: addProduct -> addItem
    private static void addItem() {
        System.out.print("Enter item name to add: ");
        String newItem = console.nextLine().trim();

        // Validate name
        if (newItem.isEmpty()) {
            System.out.println("Item name cannot be empty.");
            return;
        }

        // Check for duplicates (case-insensitive)
        String existingKey = getExistingKeyIgnoreCase(newItem);
        if (existingKey != null) {
            System.out.println("Item already exists with name: " + existingKey);
            return;
        }

        System.out.print("Enter price (integer): ");
        Integer newPrice = readPositiveInteger();
        if (newPrice == null) {
            System.out.println("Invalid price. Please enter a positive integer.");
            return;
        }

        itemPriceMap.put(newItem, newPrice);
        System.out.println("Item added: " + newItem + " - " + newPrice);
    }

    // Renamed method: printProduct -> displayCatalog
    private static void displayCatalog() {
        System.out.println("=== All Items & Prices ===");
        if (itemPriceMap.isEmpty()) {
            System.out.println("(No items available)");
        } else {
            for (Map.Entry<String, Integer> entry : itemPriceMap.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
        System.out.println("Total items: " + itemPriceMap.size());
    }

    // Renamed method: searchcheapestProduct -> showLowestPricedItem
    private static void showLowestPricedItem() {
        if (itemPriceMap.isEmpty()) {
            System.out.println("Catalog is empty. No cheapest item to show.");
            return;
        }

        String lowestItem = null;
        Integer lowestPrice = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : itemPriceMap.entrySet()) {
            if (entry.getValue() < lowestPrice) {
                lowestItem = entry.getKey();
                lowestPrice = entry.getValue();
            }
        }

        System.out.println("Cheapest item: " + lowestItem + " - " + lowestPrice);
    }

    // Helper: case-insensitive key existence
    private static String getExistingKeyIgnoreCase(String key) {
        for (String existing : itemPriceMap.keySet()) {
            if (existing.equalsIgnoreCase(key)) {
                return existing;
            }
        }
        return null;
    }

    // Helper: safely read a positive integer, handling newline issues
    private static Integer readPositiveInteger() {
        String line = console.nextLine().trim();
        try {
            int val = Integer.parseInt(line);
            return val > 0 ? val : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}