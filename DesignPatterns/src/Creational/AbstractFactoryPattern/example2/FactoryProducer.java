package Creational.AbstractFactoryPattern.example2;

public class FactoryProducer {
    public static MovieFactoryInterface getFactory(String choice) {
        if (choice.equalsIgnoreCase("HollyWoodMovie")) {
            return new HollyWoodMovieFactory();
        } else if (choice.equalsIgnoreCase("BollyWoodMovie")) {
            return new BollyWoodMovieFactory();
        }

        return null;
    }
}
