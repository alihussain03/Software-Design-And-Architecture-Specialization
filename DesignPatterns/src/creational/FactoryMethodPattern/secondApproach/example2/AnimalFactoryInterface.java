package creational.FactoryMethodPattern.secondApproach.example2;

public abstract class AnimalFactoryInterface {
    public abstract Animal GetAnimalType(String type) throws Exception;
}
