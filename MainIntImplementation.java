import java.io.*;

interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + ", Gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + ", Gear: " + gear);
    }
}

class MainIntImplementation {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        Bike bike = new Bike();

        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.print("Bicycle present state: ");
        bicycle.printStates();

        System.out.print("Bike present state: ");
        bike.printStates();
    }
}
