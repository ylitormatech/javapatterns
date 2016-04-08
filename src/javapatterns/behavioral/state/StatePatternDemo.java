package javapatterns.behavioral.state;

/**
 * Created by marco on 02/04/16.
 */
public class StatePatternDemo {

    public StatePatternDemo() {
        System.out.println("\n### State Pattern demo\n");
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new StatePatternDemo();
    }


}
