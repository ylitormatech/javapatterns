package javapatterns.behavioral.strategy;

/**
 * Created by marco on 9.4.2016.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
