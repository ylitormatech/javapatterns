/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns.builder;

/**
 *
 * @author marco
 */
public class BuilderPatternDemo {
      public static void main(String[] args) {
   
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Kasvisruoka");
      vegMeal.showItems();
      System.out.println("Hinta yhteensä: " + vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nEi kasvisruoka");
      nonVegMeal.showItems();
      System.out.println("Hinta yhteensä: " + nonVegMeal.getCost());
   }
}
