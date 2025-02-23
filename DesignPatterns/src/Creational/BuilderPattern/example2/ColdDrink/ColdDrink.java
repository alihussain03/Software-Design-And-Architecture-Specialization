package Creational.BuilderPattern.example2.ColdDrink;

import Creational.BuilderPattern.example2.Item;
import Creational.BuilderPattern.example2.MealPacking.Bottle;
import Creational.BuilderPattern.example2.MealPacking.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}

