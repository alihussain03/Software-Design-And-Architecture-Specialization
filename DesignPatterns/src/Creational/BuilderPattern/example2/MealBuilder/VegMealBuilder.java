package Creational.BuilderPattern.example2.MealBuilder;

import Creational.BuilderPattern.example2.Burger.VeggieBurger;
import Creational.BuilderPattern.example2.ColdDrink.Coke;
import Creational.BuilderPattern.example2.Meal;

public class VegMealBuilder implements MealBuilderInterface {
    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VeggieBurger());
    }


    @Override
    public void buildDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
