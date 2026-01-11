public class Truck extends Vehicle implements Refuelable {

    public Truck(String brand) {
        super(6, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void refuel() {
        System.out.println("Truck is being refueled.");
    }
}