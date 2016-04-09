package javapatterns.behavioral.chainofresponsibility;

/**
 * Created by marco on 9.4.2016.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
