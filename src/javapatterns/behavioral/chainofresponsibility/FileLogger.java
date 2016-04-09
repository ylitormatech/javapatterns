package javapatterns.behavioral.chainofresponsibility;

/**
 * Created by marco on 9.4.2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
