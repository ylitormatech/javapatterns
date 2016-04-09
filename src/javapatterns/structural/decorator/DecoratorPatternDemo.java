package javapatterns.structural.decorator;

/**
 * Created by marco on 02/04/16.
 */
public class DecoratorPatternDemo {

    public DecoratorPatternDemo() {
        System.out.println("\n### Decorator Pattern demo\n");
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new DecoratorPatternDemo();
    }

}
