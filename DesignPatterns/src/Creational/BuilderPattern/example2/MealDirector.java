package Creational.BuilderPattern.example2;

import Creational.BuilderPattern.example2.MealBuilder.MealBuilderInterface;

class MealDirector {
    MealBuilderInterface mealBuilder;

    public void construct(MealBuilderInterface builder) {
        mealBuilder = builder;
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
