package Creational.BuilderPattern.example2;

import Creational.BuilderPattern.example2.MealPacking.Packing;

public interface Item {
    String name();

    Packing packing();

    float price();
}
