package Structural;


abstract class Vechile {

    protected Workshop wk1;

    protected Workshop wk2;

    protected Vechile(Workshop wk1, Workshop wk2) {
        this.wk1 = wk1;
        this.wk2 = wk2;
    }

    abstract protected void manufacture();

}

class Car extends Vechile {

    protected Car(Workshop wk1, Workshop wk2) {
        super(wk1, wk2);
    }

    @Override
    protected void manufacture() {
        System.out.println(" Car");
        wk1.work();
        wk2.work();

    }
}

class Bike extends Vechile {

    protected Bike(Workshop wk1, Workshop wk2) {
        super(wk1, wk2);
    }

    @Override
    protected void manufacture() {
        System.out.println(" Bike");
        wk1.work();
        wk2.work();
    }
}

interface Workshop {
    abstract void work();
}

class Assemble implements Workshop {

    @Override
    public void work() {
        System.out.println(" Assembled");
        System.out.println(" And");
    }
}

class Produce implements Workshop {

    @Override
    public void work() {
        System.out.println(" Produce");
    }
}


/*    The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation so that the two can vary independently.*/
public class BridgeDesignPattern {
    public static void main(String[] args) {
        Vechile v1 = new Car(new Assemble(), new Produce());
        v1.manufacture();

        Vechile v2 = new Bike(new Assemble(), new Produce());
        v2.manufacture();

    }
}
