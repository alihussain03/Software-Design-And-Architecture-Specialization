package Creational.BuilderPattern.example2;

import Creational.BuilderPattern.example2.MealBuilder.MealBuilderInterface;

class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
