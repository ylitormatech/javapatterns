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
    
    public User(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update() {
        buyCar();
    }
    
    public void buyCar() {
        System.out.println("Tarkkailija sai tiedon auton saapumisesta varastoon.");
    }
    
    public void unsubscribe() {
        observable.removeObserver(this);
    }

}
