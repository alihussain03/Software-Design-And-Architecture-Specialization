package Creational.FactoryMethodPattern.firstApproach.example2.factory;

import Creational.FactoryMethodPattern.firstApproach.example2.product.Circle;
import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
