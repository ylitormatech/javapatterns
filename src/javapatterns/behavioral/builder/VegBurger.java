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
public class VegBurger extends Burger{
    
   @Override
   public float price() {
      return 6.5f;
   }

   @Override
   public String name() {
      return "Kasvishampurilainen";
   }
}
