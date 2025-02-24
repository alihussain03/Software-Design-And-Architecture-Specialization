package Creational.AbstractFactoryPattern.example1;

import Creational.AbstractFactoryPattern.example1.Color.Color;
import Creational.AbstractFactoryPattern.example1.Factory.AbstractFactory;
import Creational.AbstractFactoryPattern.example1.Factory.FactoryProducer;
import Creational.AbstractFactoryPattern.example1.Shape.Shape;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor("RED");
        color.fill();

    }
}
