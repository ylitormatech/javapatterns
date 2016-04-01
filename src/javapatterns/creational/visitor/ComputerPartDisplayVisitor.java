/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.creational.visitor;

/**
 *
 * @author marco
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    
   @Override
   public void visit(Computer computer) {
      System.out.println("Näytetään tietokone.");
   }

   @Override
   public void visit(Mouse mouse) {
      System.out.println("Näytetään hiiri.");
   }

   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Näytetään näppäimistö.");
   }

   @Override
   public void visit(Monitor monitor) {
      System.out.println("Näytetään monitori.");
   }
}
