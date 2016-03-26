/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.observable;

import java.lang.reflect.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marco
 */
public class BlueCarTest {
    
    /**
     * Test of isInStock method, of class BlueCar.
     */
    @Test
    public void testIsInStock() {
        System.out.println("isInStock");
        BlueCar instance = new BlueCar();
        boolean expResult = true;
        boolean result = instance.isInStock();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInStock method, of class BlueCar.
     */
    @Test
    public void testSetInStock() {
        System.out.println("setInStock");
        boolean inStock = false;
        BlueCar instance = new BlueCar();
        instance.setInStock(inStock);
        boolean expResult = false;
        boolean result = instance.isInStock();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setInStock method , of class BlueCar, and update of class User.
     * 
     */
    @Test
    public void testSetInStockObserverUpdate() {
        System.out.println("setInStockObserverUpdate");
        boolean inStock = false;
        BlueCar instance = new BlueCar();
        User o = new User(instance);
        instance.setInStock(inStock);
        // get private field observable of class User
//        Class cls = o.getClass();
//        Field ob = cls.getDeclaredField("observable");
//        boolean result = ob.get(o);
        
        
//        boolean expResult = false;
//        boolean result = 
//        assertEquals(expResult, result);
    }
    
    /**
     * Test of notifyObserver method with observers, of class BlueCar.
     */
    @Test
    public void testNotifyObserver() {
        System.out.println("notifyObserver");
        BlueCar instance = new BlueCar();
        User o = new User(instance);
        instance.addObserver(o);
        instance.notifyObserver();
    }
    
    /**
     * Test of notifyObserver method with no observers, of class BlueCar.
     */
    @Test
    public void testNotifyObserverNoObservers() {
        System.out.println("notifyObserver");
        BlueCar instance = new BlueCar();
        instance.notifyObserver();
    }

    
    /**
     * Test of addObserver method, of class BlueCar.
     */
    @Test
    public void testAddObserver() {
        System.out.println("addObserver");
        BlueCar instance = new BlueCar();
        User o = new User(instance);
        instance.addObserver(o);
    }

    /**
     * Test of removeObserver method, of class BlueCar.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        BlueCar instance = new BlueCar();
        User o = new User(instance);
        instance.addObserver(o);
        instance.removeObserver(o);
    }
    
}
