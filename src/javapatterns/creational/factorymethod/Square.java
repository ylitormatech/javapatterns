package javapatterns.creational.factorymethod;

/**
 * Created by marco on 9.4.2016.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
