package Creational.Builder.example2;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}