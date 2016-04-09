package javapatterns.structural.proxy;

/**
 * Created by marco on 02/04/16.
 */
public class ProxyPatternDemo {

    public ProxyPatternDemo() {
        System.out.println("\n### Proxy Pattern demo\n");
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new ProxyPatternDemo();
    }

}
