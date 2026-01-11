package m3activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3Activity1 {

    public static void main(String[] args) {

        List<String> itemList = new ArrayList<>();
        itemList.add("Laptop");
        itemList.add("Mouse");
        itemList.add("Keyboard");
        itemList.add("Monitor");
        itemList.add("Printer");

        System.out.println("Product List:");

        int counter = 1;
        for (String item : itemList) {
            System.out.println(counter + ". " + item);
            counter++;
        }

        itemList.add("Webcam");
        itemList.remove(1);

        System.out.println("Updated Product List:");

        counter = 1;
        for (String item : itemList) {
            System.out.println(counter + ". " + item);
            counter++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search product: ");
        String query = scanner.nextLine();
        boolean isFound = false;

        for (String currentItem : itemList) {
            if (query.equals(currentItem)) {
                isFound = true;
            }
        }

        if (isFound) {
            System.out.println("Item found: " + query);
        } else {
            System.out.println("Item not found.");
        }

        scanner.close();
    }
}