package Creational.BuilderPattern.example2.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}