/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns;

import javapatterns.creational.builder.BuilderPatternDemo;
import javapatterns.structural.composite.CompositePatternDemo;
import javapatterns.behavioral.iterator.IteratorPatternDemo;
import javapatterns.behavioral.mediator.MediatorPatternDemo;
import javapatterns.behavioral.observer.ObservablePatternDemo;
import javapatterns.creational.visitor.VisitorPatternDemo;

/**
 *
 * @author marco
 */
public class JavaPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new BuilderPatternDemo();
        new CompositePatternDemo();
        new IteratorPatternDemo();
        new MediatorPatternDemo();
        new ObservablePatternDemo();
        new VisitorPatternDemo();
    }
    
}
