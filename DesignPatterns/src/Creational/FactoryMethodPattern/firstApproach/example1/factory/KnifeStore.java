package Creational.FactoryMethodPattern.firstApproach.example1.factory;

import Creational.FactoryMethodPattern.firstApproach.example1.product.Knife;

public abstract class KnifeStore {
    // Factory Method - Subclasses will implement this
    protected abstract Knife createKnife(String type);

    // Common orderKnife method
    public Knife orderKnife(String type) {
        Knife knife = createKnife(type); // Uses the factory method

        // Common preparation steps
        knife.sharpen();
        knife.polish();

        return knife;
    }
}
