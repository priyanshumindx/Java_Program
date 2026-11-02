
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key or button");
    }
}

public class absPra {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        vehicle.start();
    }
}
