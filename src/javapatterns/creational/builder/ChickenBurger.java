/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.creational.builder;

/**
 *
 * @author marco
 */
public class ChickenBurger extends Burger {
    
   @Override
   public float price() {
      return 5.90f;
   }

   @Override
   public String name() {
      return "Kanahampurilainen";
   }
}
