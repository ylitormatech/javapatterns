package javapatterns.behavioral.interpreter;

/**
 * Created by marco on 9.4.2016.
 */
public interface Expression {
    public boolean interpret(String context);
}
