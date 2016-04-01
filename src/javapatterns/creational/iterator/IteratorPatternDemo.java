/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.creational.iterator;

/**
 *
 * @author marco
 */
public class IteratorPatternDemo {

    public IteratorPatternDemo() {
        System.out.println("\n### Mediator Pattern demo\n");
        System.out.println("Luodaan neljän nimen nimilista");
        NameRepository namesRepository = new NameRepository();
        System.out.println("Tulostetaan nimet listalta nimi kerrallaan");
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Nimi : " + name);
        }
        System.out.println("\n### \n");

    }

    public static void main(String[] args) {
        new IteratorPatternDemo();
   }
}
