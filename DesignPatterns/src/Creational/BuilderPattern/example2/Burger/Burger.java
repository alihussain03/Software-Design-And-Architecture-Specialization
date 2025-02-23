package Creational.BuilderPattern.example2.Burger;

import Creational.BuilderPattern.example2.Item;
import Creational.BuilderPattern.example2.MealPacking.Packing;
import Creational.BuilderPattern.example2.MealPacking.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

