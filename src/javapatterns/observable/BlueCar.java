/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.observable;

/**
 *
 * @author marco
 */
import java.util.ArrayList;

public class BlueCar implements Observable {
    
    private ArrayList<Observer> users = new ArrayList<Observer>();
    private boolean inStock = true;
    
    public boolean isInStock() {
        return inStock;
    }
    
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObserver();
    }
    
    
    @Override
    public void notifyObserver() {
        for(Observer user :users) {
            user.update();
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
