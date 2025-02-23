package Creational.BuilderPattern.example2.ColdDrink;

import Creational.BuilderPattern.example2.Packing;

class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
