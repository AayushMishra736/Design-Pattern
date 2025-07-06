package Structural;

interface Image {
    void display();
}

class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}


/*The Proxy Design Pattern is a design pattern in which the client and the actual object are connected by a proxy object.
        The client communicates with the proxy, which manages access to the real object, rather than the real object directly.
        Before sending the request to the real object, the proxy can take care of additional tasks like caching, security, logging, and lazy loading.*/
public class ProxyDesignPattern {

    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");

        image.display();

        image.display();
    }

}
