package Creational.BuilderPattern.example2;

import Creational.BuilderPattern.example2.MealBuilder.MealBuilderInterface;
import Creational.BuilderPattern.example2.MealBuilder.NonVegMealBuilder;
import Creational.BuilderPattern.example2.MealBuilder.VegMealBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo***\n");

        MealDirector director = new MealDirector();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        // making non veg meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
