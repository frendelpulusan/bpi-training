public class Car {

    String brand;
    String color;
    int year;

    Car() {
        brand = "Unknown";
        color = "Black";
        year = 2000;
    }

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println();
    }
}