/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.mediator;

/**
 *
 * @author marco
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
      User dali = new User("Dali");
      User pablo = new User("Pablo");

      dali.sendMessage("Moi! Pablo!");
      pablo.sendMessage("Moi! Dali!");
   }
}
