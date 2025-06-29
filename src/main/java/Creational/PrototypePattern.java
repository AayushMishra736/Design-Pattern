package Creational;

interface Shape {

    Shape clone();

    void draw();
}

class Circle implements Shape {

    public String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle of " + color + " color.");
    }
}


class ShapeClient {

    public Shape shapePrototype;

    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createClient() {
        return this.shapePrototype.clone();
    }


}


/*The Prototype Design Pattern is a creational pattern that enables the creation of new objects by copying an existing object.
        Prototype allows us to hide the complexity of making new instances from the client. The existing object acts as a prototype and contains the state of the object.*/
public class PrototypePattern {
    public static void main(String[] args) {
        Shape shapeClient = new Circle("red");
        ShapeClient circleShape = new ShapeClient(shapeClient);
        Shape createClient = circleShape.createClient();
        createClient.draw();
    }
}
