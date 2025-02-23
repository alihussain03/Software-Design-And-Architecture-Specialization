package Creational.BuilderPattern.example2.MealBuilder;

import Creational.BuilderPattern.example2.Burger.ChickenBurger;
import Creational.BuilderPattern.example2.ColdDrink.Pepsi;
import Creational.BuilderPattern.example2.Meal;

public class NonVegMealBuilder implements MealBuilderInterface {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }

}