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
public class Bottle implements Packing {
    
   @Override
   public String pack() {
      return "Pullo";
   }
}