package javapatterns.behavioral.command;

/**
 * Created by marco on 02/04/16.
 */
public class CommandPatternDemo {

    public CommandPatternDemo() {
        System.out.println("\n### Command Pattern demo\n");
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new CommandPatternDemo();
    }

}
