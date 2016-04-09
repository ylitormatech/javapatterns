package javapatterns.structural.bridge;

/**
 * Created by marco on 02/04/16.
 */
public class BridgePatternDemo {

    public BridgePatternDemo() {
        System.out.println("\n### Bridge Pattern demo\n");
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new BridgePatternDemo();
    }

}
