/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.behavioral.builder;

/**
 *
 * @author marco
 */
public class Pepsi extends ColdDrink {
    
   @Override
   public float price() {
      return 2.0f;
   }

   @Override
   public String name() {
      return "Pepsi";
   }
}
