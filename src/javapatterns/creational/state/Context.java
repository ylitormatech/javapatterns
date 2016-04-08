package javapatterns.creational.state;

/**
 * Created by marco on 08/04/16.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
