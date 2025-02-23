package Creational.FactoryMethodPattern.firstApproach.example2.factory;

import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;
import Creational.FactoryMethodPattern.firstApproach.example2.product.Square;

public class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMthod() {
        return new Square();
    }
}
