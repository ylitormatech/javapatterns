package javapatterns.structural.decorator;

/**
 * Created by marco on 9.4.2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
