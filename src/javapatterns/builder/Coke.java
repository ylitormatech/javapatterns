/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.builder;

/**
 *
 * @author marco
 */
public class Coke extends ColdDrink{
    
   @Override
   public float price() {
      return 3.0f;
   }

   @Override
   public String name() {
      return "Kokis";
   }
}
