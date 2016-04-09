package javapatterns.creational.prototype;

/**
 * Created by marco on 02/04/16.
 */
public class PrototypePatternDemo {

    public PrototypePatternDemo() {
        System.out.println("\n### Prototype Pattern demo\n");
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new PrototypePatternDemo();
    }

}
