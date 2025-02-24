package Creational.FactoryMethodPattern.firstApproach.example2.factory;

import Creational.FactoryMethodPattern.firstApproach.example2.product.Rectangle;
import Creational.FactoryMethodPattern.firstApproach.example2.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
