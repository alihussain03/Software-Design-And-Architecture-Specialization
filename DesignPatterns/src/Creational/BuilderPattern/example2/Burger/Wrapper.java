package Creational.BuilderPattern.example2.Burger;

import Creational.BuilderPattern.example2.Packing;

class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
