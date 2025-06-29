package Creational;

interface CarFactory {

    Car createCar();

    CarSpecification carSpecification();

}

interface Car {

    void createcar();
}

interface CarSpecification {
    void display();
}

class NorthAmericanSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("This car is only to run in america.");
    }
}

class EuropeSpecification implements CarSpecification {

    @Override
    public void display() {
        System.out.println("This car is only for europe.");
    }
}

class NorthAmericaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification carSpecification() {
        return new NorthAmericanSpecification();
    }
}

class EuropeCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification carSpecification() {
        return new EuropeSpecification();
    }
}

class Sedan implements Car {

    @Override
    public void createcar() {
        System.out.println("Assemble sedan car.");
    }
}

class Hatchback implements Car {

    @Override
    public void createcar() {
        System.out.println("Assemble hatchback car.");
    }
}

/*
    The Abstract Factory Pattern is one of the creational design patterns that provides an interface for creating families of related or dependent objects without specifying their concrete classes and implementation
*/

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        CarFactory americanCarFactory = new NorthAmericaCarFactory();
        Car americanCar = americanCarFactory.createCar();
        CarSpecification americanSpecf = americanCarFactory.carSpecification();

        americanCar.createcar();
        americanSpecf.display();

        CarFactory europeanCarFactory = new EuropeCarFactory();
        Car europeanCar = europeanCarFactory.createCar();
        CarSpecification europeanCarSpecification = europeanCarFactory.carSpecification();

        europeanCar.createcar();
        europeanCarSpecification.display();
        ;
    }
}
