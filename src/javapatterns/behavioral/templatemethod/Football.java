package javapatterns.behavioral.templatemethod;

/**
 * Created by marco on 9.4.2016.
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Jalkapallo päättynyt!");
    }

    @Override
    void initialize() {
        System.out.println("Jalkapallo alustettu! Ala pelaamaan.");
    }

    @Override
    void startPlay() {
        System.out.println("Jalkapallo aloitettu. Hyvää peliä!");
    }
}
