package javapatterns.structural.decorator;

/**
 * Created by marco on 9.4.2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
