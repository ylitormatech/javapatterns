package javapatterns.behavioral.state;

/**
 * Created by marco on 08/04/16.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
