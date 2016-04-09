package javapatterns.creational.singleton;

/**
 * Created by marco on 02/04/16.
 */
public class SingletonPatternDemo {

    public SingletonPatternDemo() {
        System.out.println("\n### Singleton Pattern demo\n");
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new SingletonPatternDemo();
    }

}
