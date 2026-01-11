public class MainApplication {

    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Truck truck = new Truck("Volvo");

        // Call inherited and implemented methods
        car.startEngine();
        car.refuel();

        truck.startEngine();
        truck.refuel();

        // Destroy vehicles
        destroyVehicle(car);
        destroyVehicle(truck);
    }

    // Method that accepts ONE parameter (either Car or Truck via Vehicle)
    public static void destroyVehicle(Vehicle vehicle) {
        vehicle.destroy();
    }
}