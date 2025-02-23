package Creational.BuilderPattern.example2.MealBuilder;

import Creational.BuilderPattern.example2.Meal;

public interface MealBuilderInterface {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
