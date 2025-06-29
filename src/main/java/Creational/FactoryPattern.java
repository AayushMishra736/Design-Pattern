package Creational;

import java.util.Vector;

abstract class Vehicle {
    public abstract void printVehicle();
}

class Twowheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("This is two wheeler.");
    }
}

class FourWheeler extends Vehicle {

    @Override
    public void printVehicle() {
        System.out.println("This is four wheeler.");
    }
}

interface VehicleFactory {
    Vehicle createVehicle();
}

class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Twowheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

class Client {
    public Vehicle vecVehicle;

    public Client(VehicleFactory factory) {
        vecVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vecVehicle;
    }

}

public class FactoryPattern {
    public static void main(String[] args) {
        VehicleFactory twoWheeler = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheeler);
        Vehicle vectw = twoWheelerClient.getVehicle();
        vectw.printVehicle();
        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle ve = fourWheelerFactory.createVehicle();
        ve.printVehicle();


    }
}
