package javapatterns.behavioral.observer;

/**
 * Created by marco on 01/04/16.
 */
public class ObserverPatternDemo {

    public ObserverPatternDemo() {

        System.out.println("\n### Observable demo\n");
        System.out.println("Luodaan sininen auto. Autoa ei ole varastossa. ");
        BlueCar car = new BlueCar();
        System.out.println("Lisätään tarkkailija odottamaan auton saapumista varastoon.");
        User o = new User(car);
        System.out.println("Lisätään toinen tarkkailija odottamaan auton saapumista varastoon.");
        User o2 = new User(car);
        System.out.println("Auto saapuu varastoon");
        car.setInStock(true);
        System.out.println("\n###\n");
    }

    public static void main(String[] args) {
        new ObserverPatternDemo();
    }

}
