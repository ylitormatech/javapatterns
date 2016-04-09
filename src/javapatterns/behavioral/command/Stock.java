package javapatterns.behavioral.command;

/**
 * Created by marco on 9.4.2016.
 */
public class Stock {

    private String name = "Härveli";
    private int quantity = 10;

    public void buy(){
        System.out.println("Varasto [ Nimi: "+name+", Määrä: " + quantity +" ] ostettu");
    }
    public void sell(){
        System.out.println("Varasto [ Nimi: "+name+", Määrä: " + quantity +" ] myyty");
    }
}
