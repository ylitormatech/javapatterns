package javapatterns.behavioral.memento;

/**
 * Created by marco on 9.4.2016.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
