/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.observable;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author marco
 */
public class BlueCarTest {
    BlueCar instance = new BlueCar();
    User o = new User(instance);
    
    
    @Before
    public void setUp() throws InterruptedException{
        instance.addObserver(o);
        Thread.sleep(1000);
    }
    
    
    
    /**
     * Test of isInStock method, of class BlueCar.
     */
    @Test
    public void testIsInStock() {
        System.out.println("isInStock");
        //BlueCar instance = new BlueCar();
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
        instance.setInStock(inStock);
 
    }
    
 
    
    /**
     * Test of notifyObserver method with observers, of class BlueCar.
     */
    @Test
    public void testNotifyObserver() {
        System.out.println("notifyObserver");
        instance.notifyObserver();
    }
    

    /**
     * Test of addObserver method, of class BlueCar.
     */
    @Test
    public void testAddObserver() {
        System.out.println("addObserver");
        instance.addObserver(o);
    }

    /**
     * Test of removeObserver method, of class BlueCar.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");
        instance.removeObserver(o);
    }
    
}
