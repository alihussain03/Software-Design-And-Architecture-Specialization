package Creational.FactoryMethodPattern.secondApproach.example2;

public class Duck implements Animal {
    @Override
    public void eat() {
        System.out.println("Duck is eating.");
    }

    @Override
    public void speak() {
        System.out.println("Duck says Pack-pack.");
    }
}
