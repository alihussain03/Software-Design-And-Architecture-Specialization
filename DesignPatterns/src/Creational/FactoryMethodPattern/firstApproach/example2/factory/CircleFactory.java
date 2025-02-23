package Creational.FactoryMethodPattern.firstApproach.example2.factory;

import Creational.FactoryMethodPattern.firstApproach.example2.product.Circle;
import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMthod() {
        return new Circle();
    }
}
