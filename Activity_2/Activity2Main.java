package ph.com.bpi.activity2;

import java.util.Scanner;

public class Activity2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String ageString = scanner.nextLine();
        int ageInt = Integer.parseInt(ageString);
        double ageDouble = (double) ageInt;
        System.out.println("Your age as int: " + ageInt);
        System.out.println("Your age as double: " + ageDouble);
        scanner.close();
    }
}