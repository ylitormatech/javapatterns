package javapatterns.behavioral.templatemethod;

/**
 * Created by marco on 02/04/16.
 */
public class TemplateMethodPatternDemo {

    public TemplateMethodPatternDemo() {
        System.out.println("\n### Template Method Pattern demo\n");
        Game game = new Pesapallo();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new TemplateMethodPatternDemo();
    }

}
