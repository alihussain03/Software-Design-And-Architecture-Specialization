package creational.FactoryMethodPattern.secondApproach.example2;

public class Client {
    public static void main(String[] args) throws Exception {
        ConcreteFactory animalFactory = new ConcreteFactory();
        //get an object of Lion and call its eat method.
        Animal animal1 = animalFactory.GetAnimalType("Lion");

        //call eat method of Lion
        animal1.eat();

        //call speak method of Lion
        animal1.speak();

        //get an object of Duck and call its eat method.
        Animal animal2 = animalFactory.GetAnimalType("Duck");

        //call eat method of Duck
        animal2.eat();

        //call speak method of Duck
        animal2.speak();
    }
}
