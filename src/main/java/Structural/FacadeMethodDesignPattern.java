package Structural;

class DVDPalyer {
    public void on() {
        System.out.println("Starting a dvd player.");
    }

    public void play() {
        System.out.println("Play a movie.");
    }

    public void off() {
        System.out.println("Switching of dvd player");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector ON.");
    }

    public void wideScreen() {
        System.out.println("Screen size large.");
    }

    public void off() {
        System.out.println("Projector OFF.");
    }
}

class Amplifier {

    public void on() {
        System.out.println("Amplifier ON.");
    }

    public void adjustVolume() {
        System.out.println("Increasing volume..");
    }

    public void off() {
        System.out.println("Switching off amplifier.");
    }

}

class Light {

    public void dim() {
        System.out.println("Minimize the light.");
    }

    public void enhanceLight() {
        System.out.println("Maximize the light.");
    }

}

class HomeTheaterFacade {
    private DVDPalyer dvdPalyer;
    private Projector projector;
    private Amplifier amplifier;
    private Light light;

    public HomeTheaterFacade(DVDPalyer dvdPalyer, Projector projector, Amplifier amplifier, Light light) {
        this.dvdPalyer = dvdPalyer;
        this.projector = projector;
        this.amplifier = amplifier;
        this.light = light;
    }

    public void watchMovie() {
        System.out.println("Start watching movie by starting all devices.");
        dvdPalyer.on();
        projector.on();
        projector.wideScreen();
        amplifier.on();
        light.dim();
        System.out.println("Movie started..");
    }

    public void endMovie() {
        System.out.println("Movie Ended..");
        dvdPalyer.off();
        projector.off();
        amplifier.off();
        light.enhanceLight();
        System.out.println("Shutting movie theater down...");
        System.out.println("Bye Bye...");
    }


}


/*
Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a high-level interface that makes the subsystem easier to use.*/
public class FacadeMethodDesignPattern {

    public static void main(String[] args) {

        DVDPalyer dvd = new DVDPalyer();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        Light lights = new Light();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, amp, lights);

        homeTheater.watchMovie();
        System.out.println("..........................");
        homeTheater.endMovie();

    }
}
