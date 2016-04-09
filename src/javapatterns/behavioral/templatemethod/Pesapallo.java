package javapatterns.behavioral.templatemethod;

/**
 * Created by marco on 9.4.2016.
 */
public class Pesapallo extends Game {

    @Override
    void endPlay() {
        System.out.println("Pesäpallo päättynyt!");
    }

    @Override
    void initialize() {
        System.out.println("Pesäpallo alustettu! Ala pelaamaan.");
    }

    @Override
    void startPlay() {
        System.out.println("Pesäpallo aloitettu. Hyvää peliä!");
    }
}
