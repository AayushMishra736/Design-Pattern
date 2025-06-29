package Creational;

class Computer {

    private String cpu;

    private String ram;

    private String storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }

}

interface Builder {
    void buildCPU();

    void buildRAM();

    void buildStorage();

    Computer getResult();
}

class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
/*

    The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step. It allows the construction of a product in a step-by-step manner, where the construction process can change based on the type of product being built.
        This pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
*/

public class BuilderDesignPattern {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        gamingComputer.displayInfo();
    }
}
