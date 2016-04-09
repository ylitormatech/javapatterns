/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.behavioral.mediator;

/**
 *
 * @author marco
 */
public class MediatorPatternDemo {

    public MediatorPatternDemo() {
        System.out.println("\n### Mediator Pattern demo\n");
        System.out.println("Luodaan käyttäjä.");
        User dali = new User("Dali");
        System.out.println("Luodaan toinen käyttäjä.");
        User pablo = new User("Pablo");
        System.out.println("Käyttäjät lähettävät viestin keskustelupalstalle");

        dali.sendMessage("Moi! Pablo!");
        pablo.sendMessage("Moi! Dali!");
        System.out.println("\n###\n");
    }

    public static void main(String[] args) {
        new MediatorPatternDemo();
   }
}
