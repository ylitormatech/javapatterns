/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.composite;

/**
 *
 * @author marco
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
   
      Employee CEO = new Employee("Marco","Toimitusjohtaja", 50000);

      Employee headSales = new Employee("Rami","Myyntijohtaja", 40000);

      Employee headMarketing = new Employee("Mika","Markkinointijohtaja", 30000);

      Employee clerk1 = new Employee("Liisa","Markkinointassistentti", 20000);
      Employee clerk2 = new Employee("Petri","Markkinointassistentti", 20000);

      Employee salesExecutive1 = new Employee("Risto","Myynti", 25000);
      Employee salesExecutive2 = new Employee("Raija","Myynti", 25000);

      CEO.add(headSales);
      CEO.add(headMarketing);

      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);

      headMarketing.add(clerk1);
      headMarketing.add(clerk2);

      //print all employees of the organization
      System.out.println(CEO); 
      
      for (Employee headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }		
   }
}
