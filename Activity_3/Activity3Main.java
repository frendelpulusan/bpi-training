package ph.com.bpi.activity3;

import java.util.Scanner;

public class Activity3Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int sum = computeSum(num1, num2);
        int difference = computeDifference(num1, num2);
        int product = computeProduct(num1, num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        scanner.close();
    }

    public static int computeSum(int a, int b) {
        return a + b;
    }

    public static int computeDifference(int a, int b) {
        return a - b;
    }

    public static int computeProduct(int a, int b) {
        return a * b;
    }
}