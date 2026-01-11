package ph.com.bpi.hello;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M3Activity2 {

    // Set to store unique products
    private static final Set<String> productSet = new HashSet<>();

    public static void main(String[] args) {

        // Initial products
        productSet.add("Laptop");
        productSet.add("Monitor");
        productSet.add("Mouse");
        productSet.add("Keyboard");
        productSet.add("Printer");

        try (Scanner scanner = new Scanner(System.in)) {
            boolean isActive = true;

            while (isActive) {
                displayMenu();
                System.out.print("Choose an option (1-4): ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        findProduct(scanner);
                        break;
                    case "2":
                        addNewProduct(scanner);
                        break;
                    case "3":
                        listProducts();
                        break;
                    case "4":
                        System.out.println("Program terminated.");
                        isActive = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please select 1, 2, 3, or 4.");
                }
                System.out.println();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("=== Product Menu ===");
        System.out.println("1. Search product");
        System.out.println("2. Add product");
        System.out.println("3. Display all products and total count");
        System.out.println("4. Exit");
    }

    private static void findProduct(Scanner scanner) {
        System.out.print("Enter product name to search: ");
        String keyword = scanner.nextLine();

        boolean exists = false;
        for (String product : productSet) {
            if (product.equalsIgnoreCase(keyword)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Product found: " + keyword);
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void addNewProduct(Scanner scanner) {
        System.out.print("Enter product name to add: ");
        String productName = scanner.nextLine();

        if (productSet.add(productName)) {
            System.out.println("Product successfully added: " + productName);
        } else {
            System.out.println("Product already exists.");
        }
    }

    private static void listProducts() {
        System.out.println("Product List:");
        for (String product : productSet) {
            System.out.println("- " + product);
        }
        System.out.println("Total unique products: " + productSet.size());
    }
}