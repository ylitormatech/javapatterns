package javapatterns.behavioral.strategy;

/**
 * Created by marco on 02/04/16.
 */
public class StrategyPatternDemo {

    public StrategyPatternDemo() {
        System.out.println("\n### Strategy Pattern demo\n");
        Context context = new Context(new OperationAdd());
        System.out.println("20 + 6 = " + context.executeStrategy(20, 6));

        context = new Context(new OperationSubstract());
        System.out.println("20 - 6 = " + context.executeStrategy(20, 6));

        context = new Context(new OperationMultiply());
        System.out.println("20 * 6 = " + context.executeStrategy(20, 6));

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new StrategyPatternDemo();
    }

}
