package Creational.FactoryMethodPattern.secondApproach.example2;

public class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void speak() {
        System.out.println("Lion says Roar.");
    }
}
