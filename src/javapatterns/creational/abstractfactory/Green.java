package javapatterns.creational.abstractfactory;

/**
 * Created by marco on 9.4.2016.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
