package javapatterns.structural.facade;

/**
 * Created by marco on 02/04/16.
 */
public class FacadePatternDemo {

    public FacadePatternDemo() {
        System.out.println("\n### Facade Pattern demo\n");
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new FacadePatternDemo();
    }

}
