package Structural;

interface Coffee {
    String getDescription();

    int getCost();
}

class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "This is plain coffee.";
    }

    @Override
    public int getCost() {
        return 4;
    }
}


abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffeeDecorator;

    public CoffeeDecorator(Coffee coffeeDecorator) {
        this.coffeeDecorator = coffeeDecorator;
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public int getCost() {
        return coffeeDecorator.getCost();
    }

}

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription() + " milk.";
    }

    @Override
    public int getCost() {
        return coffeeDecorator.getCost() + 5;
    }
}

class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }

    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription() + " sugar.";
    }

    @Override
    public int getCost() {
        return coffeeDecorator.getCost() + 5;
    }
}

/*
    The Decorator Design Pattern is a structural design pattern that allows behavior to be added to individual objects dynamically, without affecting the behavior of other objects from the same class.
        It involves creating a set of decorator classes that are used to wrap concrete components.*/

public class DecoratorDesignPattern {
    public static void main(String[] args) {

        Coffee plainCoffee = new PlainCoffee();
        System.out.println(plainCoffee.getDescription());
        System.out.println(plainCoffee.getCost());

        CoffeeDecorator milkDecorator = new MilkDecorator(plainCoffee);
        System.out.println(milkDecorator.getDescription());
        System.out.println(milkDecorator.getCost());

        CoffeeDecorator sugarDecorator = new SugarDecorator(plainCoffee);
        System.out.println(sugarDecorator.getDescription());
        System.out.println(sugarDecorator.getCost());

        CoffeeDecorator mixed = new SugarDecorator(milkDecorator);
        System.out.println(mixed.getDescription());
        System.out.println(mixed.getCost());
    }
}
