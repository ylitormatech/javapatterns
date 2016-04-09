/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns;

import javapatterns.behavioral.chainofresponsibility.ChainOfResponsibilityPatternDemo;
import javapatterns.behavioral.command.CommandPatternDemo;
import javapatterns.behavioral.interpreter.InterpreterPatternDemo;
import javapatterns.behavioral.memento.MementoPatternDemo;
import javapatterns.behavioral.state.StatePatternDemo;
import javapatterns.behavioral.strategy.StrategyPatternDemo;
import javapatterns.behavioral.templatemethod.TemplateMethodPatternDemo;
import javapatterns.creational.abstractfactory.AbstractFactoryPatternDemo;
import javapatterns.creational.builder.BuilderPatternDemo;
import javapatterns.creational.factorymethod.FactoryMethodPatternDemo;
import javapatterns.creational.prototype.PrototypePatternDemo;
import javapatterns.creational.singleton.SingletonPatternDemo;
import javapatterns.structural.adapter.AdapterPatternDemo;
import javapatterns.structural.bridge.BridgePatternDemo;
import javapatterns.structural.composite.CompositePatternDemo;
import javapatterns.behavioral.iterator.IteratorPatternDemo;
import javapatterns.behavioral.mediator.MediatorPatternDemo;
import javapatterns.behavioral.observer.ObserverPatternDemo;
import javapatterns.creational.visitor.VisitorPatternDemo;
import javapatterns.structural.decorator.DecoratorPatternDemo;
import javapatterns.structural.facade.FacadePatternDemo;
import javapatterns.structural.flyweight.FlyweightPatternDemo;
import javapatterns.structural.proxy.ProxyPatternDemo;

/**
 *
 * @author marco
 */
public class JavaPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Behavioral Patterns
        new ChainOfResponsibilityPatternDemo();
        new CommandPatternDemo();
        new InterpreterPatternDemo();
        new IteratorPatternDemo();
        new MediatorPatternDemo();
        new MementoPatternDemo();
        new ObserverPatternDemo();
        new StatePatternDemo();
        new StrategyPatternDemo();
        new TemplateMethodPatternDemo();

        // Creational Patterns
        new AbstractFactoryPatternDemo();
        new BuilderPatternDemo();
        new FactoryMethodPatternDemo();
        new PrototypePatternDemo();
        new SingletonPatternDemo();
        new VisitorPatternDemo();

        // Structural Patterns
        new AdapterPatternDemo();
        new BridgePatternDemo();
        new CompositePatternDemo();
        new DecoratorPatternDemo();
        new FacadePatternDemo();
        new FlyweightPatternDemo();
        new ProxyPatternDemo();


    }
    
}
