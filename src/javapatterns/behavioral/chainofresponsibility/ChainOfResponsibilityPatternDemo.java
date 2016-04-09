package javapatterns.behavioral.chainofresponsibility;

/**
 * Created by marco on 02/04/16.
 */
public class ChainOfResponsibilityPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public ChainOfResponsibilityPatternDemo() {
        System.out.println("\n### Chain of Responsibility Pattern demo\n");
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new ChainOfResponsibilityPatternDemo();
    }
}
