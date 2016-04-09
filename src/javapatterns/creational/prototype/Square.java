package javapatterns.creational.prototype;

/**
 * Created by marco on 9.4.2016.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
