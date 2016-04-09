package javapatterns.structural.flyweight;

/**
 * Created by marco on 02/04/16.
 */
public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public FlyweightPatternDemo() {
        System.out.println("\n### Flyweight Pattern demo\n");
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println("\n### \n");

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

    public static void main(String[] args) {
        new FlyweightPatternDemo();
    }

}
