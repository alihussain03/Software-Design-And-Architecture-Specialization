package Creational.FactoryMethodPattern.firstApproach.example2.factory;

import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
