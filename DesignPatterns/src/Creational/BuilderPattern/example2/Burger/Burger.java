package Creational.BuilderPattern.example2.Burger;

import Creational.BuilderPattern.example2.Item;
import Creational.BuilderPattern.example2.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

