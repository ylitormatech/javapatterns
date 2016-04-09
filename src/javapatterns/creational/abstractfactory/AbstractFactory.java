package javapatterns.creational.abstractfactory;

/**
 * Created by marco on 9.4.2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
