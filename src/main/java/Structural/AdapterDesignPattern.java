package Structural;

class OldPlace {

    public void print(String str) {
        System.out.println("Old places have ethics " + str);
    }
}

interface NewPlace {
    void print(String str);
}

class PlacesToVisit implements NewPlace {

    private OldPlace oldPlace;

    public PlacesToVisit(OldPlace oldPlace) {
        this.oldPlace = oldPlace;
    }

    @Override
    public void print(String str) {
        oldPlace.print(str);
    }
}

/*Two incompatible interfaces or systems can cooperate by using the adapter design pattern, a structural design pattern.
        Because of incompatible interfaces, it serves as a bridge between two classes that would not otherwise be able to communicate.
        The adapter approach is very helpful when attempting to incorporate third-party libraries or legacy code into a new system.*/
public class AdapterDesignPattern {
    public static void main(String[] args) {
        OldPlace oldPlace = new OldPlace();
        NewPlace newPlace = new PlacesToVisit(oldPlace);
        newPlace.print("compared to new places.");
    }
}
