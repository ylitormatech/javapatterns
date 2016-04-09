/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.behavioral.observer;

/**
 *
 * @author marco
 */
import java.util.ArrayList;
import java.util.Iterator;

public class BlueCar implements Observable {
    
    private ArrayList<Observer> users = new ArrayList<Observer>();
    private boolean inStock = false;
    
    public boolean isInStock() {
        return inStock;
    }
    
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObserver();
    }
    
    
    @Override
    public void notifyObserver() {
          // interator is needed to avoid ConcurrentModificationException
          for(Iterator<Observer> iterator = users.iterator(); iterator.hasNext();) {
              Observer user = iterator.next();
              user.update();
              iterator.remove();
          }
    }
    
    @Override
    public void addObserver(Observer o) {
        users.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        users.remove(o);
    }
    
}
