package javapatterns.behavioral.interpreter;

/**
 * Created by marco on 02/04/16.
 */
public class InterpreterPatternDemo {


    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression matti = new TerminalExpression("Matti");
        Expression risto = new TerminalExpression("Risto");
        return new OrExpression(matti, risto);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression elina = new TerminalExpression("Elina");
        Expression naimisissa = new TerminalExpression("Naimisissa");
        return new AndExpression(elina, naimisissa);
    }

    public InterpreterPatternDemo() {
        System.out.println("\n### Interpreter Pattern demo\n");
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("Matti on mies? " + isMale.interpret("Matti"));
        System.out.println("Elina on naimissa oleva nainen? " + isMarriedWoman.interpret("Elina Naimisissa"));


        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new InterpreterPatternDemo();
    }

}
