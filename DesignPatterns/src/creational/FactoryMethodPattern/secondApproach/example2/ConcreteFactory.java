package creational.FactoryMethodPattern.secondApproach.example2;

public class ConcreteFactory extends AnimalFactoryInterface {

    @Override
    public Animal GetAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Lion":
                return new Lion();
            default:
                throw new Exception("Animal type: " + type + " cannot be instantiated");
        }
    }
}
