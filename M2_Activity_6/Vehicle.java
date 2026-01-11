public abstract class Vehicle {

    protected int numberOfWheels;
    protected String brand;

    public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    // Abstract method
    public abstract void startEngine();

    // Concrete method
    public void destroy() {
        System.out.println(brand + " vehicle is destroyed.");
    }
}