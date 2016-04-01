/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.behavioral.builder;

/**
 *
 * @author marco
 */
public class BuilderPatternDemo {

      public BuilderPatternDemo() {
            System.out.println("\n### Builder Pattern demo\n");
            System.out.println("Luodaan aterian rakentaja");
            MealBuilder mealBuilder = new MealBuilder();

            System.out.println("Luodaan kasvisruoka");

            Meal vegMeal = mealBuilder.prepareVegMeal();
            System.out.println("Kasvisruoka");
            vegMeal.showItems();
            System.out.println("Hinta yhteensä: " + vegMeal.getCost());

            System.out.println("Luodaan normaali ruoka");

            Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
            System.out.println("\n\nNormaali ruoka");
            nonVegMeal.showItems();
            System.out.println("Hinta yhteensä: " + nonVegMeal.getCost());
            System.out.println("\n### \n");

      }

      public static void main(String[] args) {
            new BuilderPatternDemo();
       }
}
