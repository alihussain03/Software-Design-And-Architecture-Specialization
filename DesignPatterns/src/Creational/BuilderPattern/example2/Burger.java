package Creational.BuilderPattern.example2;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}