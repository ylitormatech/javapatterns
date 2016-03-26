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
public class User implements Observer {
    private Observable observable = null;
    
    private boolean inStock = false;
    
    public User(Observable observable) {
        this.observable = observable;
    }
    
    @Override
    public void update() {
        buyCar();
        unsubscribe();
    }
    
    public void buyCar() {
        System.out.println("Ostin uuden auton");
    }
    
    public void subscribe() {
        observable.addObserver(this);
    }
    public void unsubscribe() {
        observable.removeObserver(this);
    }

}
