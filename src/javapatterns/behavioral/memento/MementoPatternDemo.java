package javapatterns.behavioral.memento;

/**
 * Created by marco on 02/04/16.
 */
public class MementoPatternDemo {

    public MementoPatternDemo() {
        System.out.println("\n### Memento Pattern demo\n");
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Tila #1");
        originator.setState("Tila #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Tila #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Tila #4");
        System.out.println("Nykyinen tila: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Ensimmäinen tallennettu tila: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Toinen tallennettu tila: " + originator.getState());

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new MementoPatternDemo();
    }

}
