package javapatterns.creational.abstractfactory;

/**
 * Created by marco on 9.4.2016.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
