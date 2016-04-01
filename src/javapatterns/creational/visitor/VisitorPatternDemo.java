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
public class VisitorPatternDemo {

    public VisitorPatternDemo() {

        System.out.println("\n### Visitor Pattern demo\n");
        System.out.println("Luodaan tietokone.");
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("\n###\n");
    }

    public static void main(String[] args) {
        new VisitorPatternDemo();
   }
}
